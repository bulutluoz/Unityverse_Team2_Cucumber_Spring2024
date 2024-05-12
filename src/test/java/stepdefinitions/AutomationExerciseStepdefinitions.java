package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExerPage;
import utilities.Driver;

public class AutomationExerciseStepdefinitions {

    AutoExerPage autoExerPage = new AutoExerPage();
    Faker faker = new Faker();
    String firstname;

    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        autoExerPage.signUpLinki.click();
    }
    @And("user Create an account bolumune fake isim ve email adresi girer")
    public void userCreateAnAccountBolumuneFakeIsimVeEmailAdresiGirer() {
        firstname = faker.name().firstName();
        autoExerPage.signUpIsimKutusu.sendKeys(firstname);
        autoExerPage.signUpMailKutusu.sendKeys(faker.internet().emailAddress());

    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {

        autoExerPage.signUpButonu.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

        Actions actions = new Actions(Driver.getDriver());

        actions.click(autoExerPage.misterRadioButonu)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(firstname)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().buildingNumber())
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("72100")
                .sendKeys(Keys.TAB)
                .sendKeys("+112837464332")
                .perform();



    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
        autoExerPage.createAccountButonu.click();
    }
    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {
        Assert.assertTrue(autoExerPage.hesapOlusturulduYaziElementi.isDisplayed());
    }



}
