package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepdefinitions {
    Sheet calisilanSayfa;

    @Given("kullanici ulkeler excelinde {string}'e gider")
    public void kullanici_ulkeler_excelinde_e_gider(String istenenSayfaAdi) throws IOException {

        String dosyaYolu = "src/test/resources/ulkeler.xlsx";
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        calisilanSayfa = workbook.getSheet(istenenSayfaAdi);

    }
    @Then("{int}.satir {int}.hucredeki bilgiyi yazdirir")
    public void satir_hucredeki_bilgiyi_yazdirir(Integer satirNo, Integer sutunNo) {

        String istenenData = calisilanSayfa
                                .getRow(satirNo-1)
                                .getCell(sutunNo-1)
                                .toString();
        System.out.println(satirNo + ".satir,"+sutunNo+".sutundaki data : " + istenenData);
    }
    @Then("baskenti {string} olan ulke isminin {string} oldugunu test eder")
    public void baskenti_olan_ulke_isminin_oldugunu_test_eder(String baskentIsmi, String ulkeIsmi) {

        // her satiri bir loop ile ele alip
        // o satirdaki 1.indexdeki ingilizce baskent ismi bize verilen baskent ise
        // o satirdaki turkce ulke ismini alip verilen ulke ismi ile ayni oldugunu test edelim

        for (int i = 0; i <= calisilanSayfa.getLastRowNum() ; i++) {

            String satirdakiIngilizceBaskent = calisilanSayfa
                                                    .getRow(i)
                                                    .getCell(1)
                                                    .toString();

            String satirdakiTurkceUlkeIsmi = calisilanSayfa
                                                    .getRow(i)
                                                    .getCell(2)
                                                    .toString();

            if (satirdakiIngilizceBaskent.equalsIgnoreCase(baskentIsmi)){
                Assert.assertEquals(ulkeIsmi,satirdakiTurkceUlkeIsmi);
            }
        }

    }
    @Then("ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer expectedUlkeSayisi) {

        Integer actualUlkeSayisi = calisilanSayfa.getLastRowNum() +1 -1 ;
        // +1 cunku :  calisilanSayfa.getLastRowNum() bize index verir, satir sayisi icin 1 eklemeliyiz
        // -1 cunku :  en basta baslik satiri var, onu dusmeliyiz

        Assert.assertEquals(expectedUlkeSayisi, actualUlkeSayisi);

    }

    @Then("fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer expectedKullanilanSatirSayisi) {

        Integer actualKullanilanSatirSayisi = calisilanSayfa.getPhysicalNumberOfRows();

        Assert.assertEquals(expectedKullanilanSatirSayisi,actualKullanilanSatirSayisi);
    }


}
