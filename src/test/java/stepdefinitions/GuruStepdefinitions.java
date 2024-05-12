package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.GuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class GuruStepdefinitions {

    List<String> sirketisimleriListesi;
    GuruPage guruPage = new GuruPage();

    @Then("Company listesini konsola yazdirir")
    public void company_listesini_konsola_yazdirir() {

        sirketisimleriListesi = ReusableMethods.stringListeDonustur(guruPage.sirketIsimElementleriList);
        System.out.println(sirketisimleriListesi);

    }
    @Then("{string} in listede oldugunu test eder")
    public void in_listede_oldugunu_test_eder(String istenenSirket) {

        Assert.assertTrue(sirketisimleriListesi.contains(istenenSirket));
    }

    @And("{string} Prev.Close degerini yazdirir")
    public void prevCloseDegeriniYazdirir(String istenenSirket) {

        // bir for loop ile her satirdaki sirket ismini kontrol edip
        // eger satirdaki sirket ismi istenen sirket ise
        // o satirdaki prev.Close degerini yazdiralim

        // satirdaki sirket isminin dinamik locate'i  (//tbody)[2]/tr[    i    ]/td[1]


        for (int i = 1; i <= guruPage.sirketIsimElementleriList.size() ; i++) {

            String satirdakiSirketIsmiDinamikXpath = "(//tbody)[2]/tr[" + i + "]/td[1]";

            String satirdakiSirketIsmi = Driver.getDriver()
                                        .findElement(By.xpath(satirdakiSirketIsmiDinamikXpath))
                                        .getText();

            if (satirdakiSirketIsmi.equalsIgnoreCase(istenenSirket)){

                String satirdakiPrevClosDinamikXpath = "(//tbody)[2]/tr[" + i + "]/td[3]";
                String satirdakiPrevCloseDegeri = Driver.getDriver()
                                                .findElement(By.xpath(satirdakiPrevClosDinamikXpath))
                                                .getText();

                System.out.println( istenenSirket + " sirketinin Prev.Close degeri : " + satirdakiPrevCloseDegeri
                        ) ;
            }
        }
    }
}
