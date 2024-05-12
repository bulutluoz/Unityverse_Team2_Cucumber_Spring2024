package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {


    /*
        Junit ve TestNG'de
        eger olusturdugumuz test method'unda driver olusturmakla ugrasmak istemezsek
        Test method'uniun oldugu class'i TestBase veya TestBaseClass'a extends edip
        orada olusturulmus olan driver objesini kullaniyorduk

        Eger driver ile isimiz yoksa
        extends yapmadigimizda TestBase'den bagimsiz kaliyorduk

        Cucumber da feature ve stepdefinitions icin
        Runner class'imizda package'lari tanimladigimiz icin
        stepdefinitions package'i altinda
        herhangi bir class'da @Before notosyonu kull;anilirsa
        butun testlerde test method'undan once before methodu calisir

        Bundan dolayi Cucumber'da
        @Before... ve @After... method'larini cok dikkatli kullanmaliyiz

     */

    @After // her Scenario'dan sonra calisacak
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.quitDriver();
    }

}
