
  Feature: US1007 parametre olarak yazilan gecersiz bilgilerle giris yapilamaz

    Scenario: TC13 parametre olarak yazilan gecersiz bilgilerle
              giris yapilamamali

      Given kullanici "toUrl" anasayfaya gider
      Then account linkine tiklar
      And email olarak test datalarindan "ahmet@gmail.com" kullanir
      And password olarak test datalarindan "56789" kulllanir
      When Sign in butonuna basar
      Then giris yapilamadigini test eder
      And 3 saniye bekler
      And sayfayi kapatir