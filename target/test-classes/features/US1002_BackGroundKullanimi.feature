

Feature: US1002 kullanici BackGround ile bastaki tekrar eden adimlari calistirir

  #Background @Before gibi calisir, her scenario'dan once mutlaka devreye girer
  Background: testotomasyonu sayfasina gitme
    Given kullanici testotomasyonu anasayfaya gider

  @E2E
  Scenario: TC04 kullanici testotomasyonu sayfasinda phone aratabilmeli
    When arama kutusuna phone yazip enter tusuna basar
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir

  @regression
  Scenario: TC05 kullanici testotomasyonu sayfasinda dress aratabilmeli
    When arama kutusuna dress yazip enter tusuna basar
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC06 kullanici testotomasyonu sayfasinda baby aratabilmeli
    When arama kutusuna baby yazip enter tusuna basar
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir