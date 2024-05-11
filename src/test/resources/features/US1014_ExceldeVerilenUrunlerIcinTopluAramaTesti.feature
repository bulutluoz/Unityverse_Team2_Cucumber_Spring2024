
  Feature:US1014 Kullanici excelde verilen urunler icin arama testi yapar

    Scenario Outline: TC20 excelde verilen urunlerin arama sonuc sayisinin
                      excel'de verilen minumum sonuc sayisindan buyuk esit oldugunu test eder

      Given kullanici "toUrl" anasayfaya gider
      Then urun excelindeki "<istenenSatir>" daki urunun min. miktarini ve urun ismini kaydeder
      And urun ismini testotomasyonu sayfasinda arar ve sonuc sayisini kaydeder
      And bulunan urun sayisinin "<istenenSatir>" da verilen min. miktardan fazla oldugunu test eder
      And sayfayi kapatir
      Examples:
        |istenenSatir|
        |2           |
        |3           |
        |4           |
        |5           |
        |6           |
        |7           |
        |8           |
        |9           |
