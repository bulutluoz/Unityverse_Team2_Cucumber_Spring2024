Feature: US1020 kullanici excelden istenen testleri yapar

  @wip
  Scenario: Exceldeki datalar test edilebilmeli

  Given kullanici ulkeler excelinde "Sayfa1"'e gider
  Then 10.satir 1.hucredeki bilgiyi yazdirir
  And baskenti "Ankara" olan ulke isminin "Türkiye" oldugunu test eder
  And ulke sayisinin 190 oldugunu test eder
  And fiziki olarak kullanilan satir sayisinin 191 oldugunu test eder

