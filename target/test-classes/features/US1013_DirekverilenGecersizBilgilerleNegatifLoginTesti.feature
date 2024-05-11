
  Feature: US1013 direk verilen gecersiz bilgilerle sisteme giris yapilamamali

    @wip
    Scenario Outline: TC19 verilen gecersiz bilgileri tek tek deneyip
                      sisteme giris yapilamadigini test eder

      Given kullanici "toUrl" anasayfaya gider
      Then account linkine tiklar
      When email olarak "<verilenEmail>" kullanir
      And password olarak "<verilenPassword>" kulllanir
      Then Sign in butonuna basar
      And giris yapilamadigini test eder
      And 1 saniye bekler
      Then sayfayi kapatir
      Examples:
        |verilenEmail    	|verilenPassword      |
        |esra@fmail.com  	|1234555              |
        |gamze@gmail.com 	|mesela123            |
        |zehra@zmail.com 	|asdf4321             |
        |ayca@amail.com  	|6543241tre65         |
        |gulnur@gmail.com	|123ert678            |
