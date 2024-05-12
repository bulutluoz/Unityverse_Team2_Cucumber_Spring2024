
  Feature: US1017 kullanici sirket listesini kontrol eder


    Scenario: TC23 verilen sirket isminin listede oldugunu test eder

      Given kullanici "guruUrl" anasayfaya gider
      Then Company listesini konsola yazdirir
      And "IDFC Bank" in listede oldugunu test eder
