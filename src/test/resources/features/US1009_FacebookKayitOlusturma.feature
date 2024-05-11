Feature: US1009 Kullanici fake degerlerle facebook da kayit olusturur


  Scenario: TC15 fake bilgilerle facebookta kayit olusturma

    Given kullanici "facebookUrl" anasayfaya gider
    Then facebook cookies kabul eder
    Then 2 saniye bekler
    And facebook'da yeni hesap olustur butonuna basar
    And 1 saniye bekler
    When Faker class'indan bilgilerle facebook kayit formunu doldurur
    Then 1 saniye bekler
    And facebook kayit ol tusuna basar
    Then 12 saniye bekler
    And sayfayi kapatir
