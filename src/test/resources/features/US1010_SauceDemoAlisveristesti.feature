
  Feature: US1010 Kullanici sauceDemo sayfasinda alisveris yapabilir

    @wip
    Scenario: TC16 kullanici sectigi urunun sepete eklendigini test eder

      Given kullanici "sauceUrl" anasayfaya gider
      And 2 saniye bekler
      Then saucedemo username kutusuna "standard_user" yazar
      And saucedemo password kutusuna "secret_sauce" yazar
      And 2 saniye bekler
      Then saucedemo login tusuna basar
      And ilk urunun ismini kaydeder ve bu urunun sayfasina gider
      And 3 saniye bekler
      When saucedemo add to Cart butonuna basar
      Then saucedemo alisveris sepetine tiklar
      And 2 saniye bekler
      And sectigi urunun basarili olarak sepete eklendigini test eder
      And 2 saniye bekler
      And sayfayi kapatir


