
  Feature: US1001 testotomasyonu phone arama
      # feature dosyasina Gherkin language kullanarak yazdigimiz her bir satir
      # stepdefinitions class'larindaki bir method'u calistiran method call gibidir
      # eger yazilan tum adimlarin stepdefinition'lari tanimli ise kod otomatik olarak calisir
      # tanimli olmayan adim varsa sadece o adim icin stepdefinition olusturmamizi bekler
      # burada yazilan adimlar method call olarak calistigi icin case sensitive'dir
    @smoke @E2E @sistem
    Scenario: TC01 kullanici testotomasyonu sayfasinda phone aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna phone yazip enter tusuna basar
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC02 kullanici testotomasyonu sayfasinda dress aratabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna dress yazip enter tusuna basar
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC03 kullanici testotomasyonu sayfasinda baby aratabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna baby yazip enter tusuna basar
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir