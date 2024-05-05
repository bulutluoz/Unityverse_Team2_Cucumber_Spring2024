
  Feature: US1006 test datasi olarak verilen gecersiz bilgilerle giris yapilamaz


    Scenario: TC11 test datasi olarak verilen
              gecerli email ve gecersiz password ile giris yapilamamali

      Given kullanici "toUrl" anasayfaya gider
      Then account linkine tiklar
      And email olarak test datalarindan "toGecerliEmail" kullanir
      And password olarak test datalarindan "toGecersizPassword" kulllanir
      When Sign in butonuna basar
      Then giris yapilamadigini test eder
      And 3 saniye bekler
      And sayfayi kapatir


    Scenario: TC12 test datasi olarak verilen
              gecersiz email ve gecersiz password ile giris yapilamamali

      Given kullanici "toUrl" anasayfaya gider
      Then account linkine tiklar
      And email olarak test datalarindan "toGecersizEmail" kullanir
      And password olarak test datalarindan "toGecersizPassword" kulllanir
      When Sign in butonuna basar
      Then giris yapilamadigini test eder
      And 3 saniye bekler
      And sayfayi kapatir