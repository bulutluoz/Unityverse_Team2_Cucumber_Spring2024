package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestOtomasyonuStepdefinitions {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @When("arama kutusuna phone yazip enter tusuna basar")
    public void arama_kutusuna_phone_yazip_enter_tusuna_basar() {
        testotomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
    }
    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
        Assert.assertTrue(testotomasyonuPage.bulunanSonucElementleriListesi.size()>0);
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
       Driver.quitDriver();
    }

    @When("arama kutusuna dress yazip enter tusuna basar")
    public void arama_kutusuna_dress_yazip_enter_tusuna_basar() {
        testotomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }

    @When("arama kutusuna baby yazip enter tusuna basar")
    public void aramaKutusunaBabyYazipEnterTusunaBasar() {
        testotomasyonuPage.aramaKutusu.sendKeys("baby" + Keys.ENTER);
    }

    @When("arama kutusuna {string} yazip enter tusuna basar")
    public void aramaKutusunaYazipEnterTusunaBasar(String istenenKelime) {
        testotomasyonuPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);

    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int sure) {

        ReusableMethods.bekle(sure);

    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String testDataIstenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(testDataIstenenUrl));
    }

    @Then("istenen {string} sayfasina gidildigini test eder")
    public void istenenSayfasinaGidildiginiTestEder(String istenenUrl) {

        String expectedUrl = ConfigReader.getProperty(istenenUrl);
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Then("account linkine tiklar")
    public void account_linkine_tiklar() {
        testotomasyonuPage.accountLinki.click();
    }
    @Then("email olarak test datalarindan {string} kullanir")
    public void email_olarak_test_datalarindan_kullanir(String testDataEmail) {

        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty(testDataEmail));
    }
    @Then("password olarak test datalarindan {string} kulllanir")
    public void password_olarak_test_datalarindan_kulllanir(String testDataPassword) {
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty(testDataPassword));
    }
    @Then("Sign in butonuna basar")
    public void sign_in_butonuna_basar() {
        testotomasyonuPage.loginSayfasiLoginButonu.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(testotomasyonuPage.logoutButonu.isDisplayed());
    }

    @Then("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(testotomasyonuPage.emailKutusu.isDisplayed());
    }

    @And("email olarak {string} kullanir")
    public void emailOlarakKullanir(String yazilanEmail) {
        testotomasyonuPage.emailKutusu.sendKeys(yazilanEmail);
    }

    @And("password olarak {string} kulllanir")
    public void passwordOlarakKulllanir(String yazilanPassword) {

        testotomasyonuPage.passwordKutusu.sendKeys(yazilanPassword);
    }
}
