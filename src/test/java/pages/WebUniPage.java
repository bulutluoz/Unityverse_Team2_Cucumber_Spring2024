package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniPage {

    public WebUniPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
