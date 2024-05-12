package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExerPage {

    public AutoExerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signUpLinki;

    @FindBy(xpath = "//*[@*='signup-name']")
    public WebElement signUpIsimKutusu;

    @FindBy(xpath = "//*[@*='signup-email']")
    public WebElement signUpMailKutusu;

    @FindBy(xpath = "//*[@*='signup-button']")
    public WebElement signUpButonu;

    @FindBy(id = "id_gender1")
    public WebElement misterRadioButonu;

    @FindBy(xpath = "//*[@*='create-account']")
    public WebElement createAccountButonu;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement hesapOlusturulduYaziElementi;
}
