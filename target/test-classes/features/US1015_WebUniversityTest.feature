
  Feature: US1015 webUniversity negatif login testi

    @wip
    Scenario: TC21 yanlis kullanici bilgileri ile webUniversity sayfasina giris yapilamaz

      Given kullanici "webUniUrl" anasayfaya gider
      And Login Portal a  kadar asagi iner
      Then Login Portal a click yapar
      And acilan yeni window'a gecis yapar
      When webUni username kutusuna "username" yazar
      And webUni password kutusuna "password" yazar
      Then webUni login butonuna basar
      And 2 saniye bekler
      And popup da cikan yazinin "validation failed" oldugunu test eder
      And OK tusuna basarak popup'i kapatir
      When anasayfanin acik oldugu window'a gecer
      And 2 saniye bekler
      And ilk sayfaya donuldugunu test eder
      And sayfayi kapatir
