
  Feature: US1005 kullanici testdatasi olarak verilen gecerli bilgilerle giris yapar

    Scenario: TC10 gecerli test datalari ile giris yapilabilmeli

      Given kullanici "toUrl" anasayfaya gider
      Then account linkine tiklar
      And email olarak test datalarindan "gecerliEmail" kullanir
      And password olarak test datalarindan "gecerliPassword" kulllanir
      Then Sign in butonuna basar
      And basarili olarak giris yapildigini test eder
      And 3 saniye bekler
      And sayfayi kapatir