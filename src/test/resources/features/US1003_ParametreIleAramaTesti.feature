
  Feature: US1003 kullanici istedigi kelimeyi aratir

    Scenario: TC07 kullanici testotomasyonu sayfasinda istedigi kelimeyi aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "dress" yazip enter tusuna basar
      Then arama sonucunda urun bulunabildigini test eder
      And 1 saniye bekler
      #Cucumber'da test adimi yazilirken sayi kullanildiginda, otomatik olarak parametre tanimlar
      #And sayfayi kapatir