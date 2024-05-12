
  Feature: US1018 Kullanici istenen sirketin onceki gun kapanis degerini yazdirir

    Scenario: TC24 kullanici onceki kapanis degerini yazdirabilmeli

      Given kullanici "guruUrl" anasayfaya gider
      Then Company listesini konsola yazdirir
      And "IDFC Bank" Prev.Close degerini yazdirir


