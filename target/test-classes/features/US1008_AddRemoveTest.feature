
  Feature: US1008 kullanici herokuApp sayfasinda butonlarin calistigini test eder


    Scenario: TC14 add ve remove butonlari calisir durumda olmali

      Given kullanici "herokuUrl" anasayfaya gider
      When kullanici Add Element butonuna basar
      And 2 saniye bekler
      And Delete butonu’nun gorunur oldugunu test eder
      Then Delete tusuna basar
      And Add Remove Elements yazisinin gorunur oldugunu test eder
      And 2 saniye bekler
      And sayfayi kapatir
