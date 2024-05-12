package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuruPage {

    public GuruPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
}
