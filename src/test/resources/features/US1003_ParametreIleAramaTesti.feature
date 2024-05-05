
  Feature: US1004 kullanici istedigi kelimeyi aratir

    Scenario: TC07 kullanici testotomasyonu sayfasinda istedigi kelimeyi aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "baby" yazip enter tusuna basar
      Then arama sonucunda urun bulunabildigini test eder
      And 10 saniye bekler
      #Cucumber'da test adimi yazilirken sayi kullanildiginda, otomatik olarak parametre tanimlar
      And sayfayi kapatir