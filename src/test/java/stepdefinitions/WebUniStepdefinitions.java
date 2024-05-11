package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.WebUniPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Set;

public class WebUniStepdefinitions {

    WebUniPage webUniPage = new WebUniPage();

    @Given("Login Portal a  kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        // login portal zaten ilk sayfada gorundugu icin bir islem yapilmadi
    }
    @Then("Login Portal a click yapar")
    public void login_portal_a_click_yapar() {
        webUniPage.loginPortalYaziElementi.click();
    }
    @Then("acilan yeni window'a gecis yapar")
    public void acilan_yeni_window_a_gecis_yapar() {
        ReusableMethods.windowDegistir(Driver.getDriver(),"http://webdriveruniversity.com/Login-Portal/index.html");
    }
    @When("webUni username kutusuna {string} yazar")
    public void web_uni_username_kutusuna_yazar(String verilenUsername) {
        webUniPage.usernameKutusu.sendKeys(verilenUsername);
    }
    @When("webUni password kutusuna {string} yazar")
    public void web_uni_password_kutusuna_yazar(String verilenPassword) {
        webUniPage.passwordKutusu.sendKeys(verilenPassword);
    }
    @Then("webUni login butonuna basar")
    public void web_uni_login_butonuna_basar() {
        webUniPage.loginButonu.click();
    }
    @Then("popup da cikan yazinin {string} oldugunu test eder")
    public void popup_da_cikan_yazinin_oldugunu_test_eder(String expectedAlertYazisi) {
        String actualPopupYazisi = Driver.getDriver()
                                    .switchTo().alert()
                                    .getText();
        Assert.assertEquals(expectedAlertYazisi,actualPopupYazisi);
    }
    @Then("OK tusuna basarak popup'i kapatir")
    public void ok_tusuna_basarak_popup_i_kapatir() {
        Driver.getDriver()
                .switchTo().alert()
                .accept();
    }
    @When("anasayfanin acik oldugu window'a gecer")
    public void anasayfanin_acik_oldugu_window_a_gecer() {

        ReusableMethods.windowDegistir(Driver.getDriver(),"https://webdriveruniversity.com/");
    }
    @When("ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("webUniUrl");

        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
