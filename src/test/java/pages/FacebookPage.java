package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Allow all cookies']")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "//*[text()='Create new account']")
    public WebElement yeniKayitOlusturButonu;

    @FindBy(name = "websubmit")
    public WebElement signUpButonu;


}
