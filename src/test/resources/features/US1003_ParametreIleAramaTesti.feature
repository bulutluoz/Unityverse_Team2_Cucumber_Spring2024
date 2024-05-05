
  Feature: US1004 kullanici istedigi kelimeyi aratir

    Scenario: TC07 kullanici testotomasyonu sayfasinda istedigi kelimeyi aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "java" yazip enter tusuna basar
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir