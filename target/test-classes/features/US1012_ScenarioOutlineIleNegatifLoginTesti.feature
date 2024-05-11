
  Feature: US1012 liste olarak verilen gecersiz bilgilerle giris yapilamaz


    Scenario Outline: TC18 gecersiz kullanici bilgileri ile sisteme giris yapilamaz

      Given kullanici "toUrl" anasayfaya gider
      Then account linkine tiklar
      When email olarak test datalarindan "<verilenEmail>" kullanir
      And password olarak test datalarindan "<verilenPassword>" kulllanir
      Then Sign in butonuna basar
      And giris yapilamadigini test eder
      And 1 saniye bekler
      Then sayfayi kapatir

      Examples:
        |verilenEmail    	|verilenPassword    	|
        |toGecerliEmail  	|toGecersizPassword 	|
        |toGecersizEmail 	|toGecerliPassword  	|
        |toGecersizEmail 	|toGecersizPassword2 	|
        |toGecersizEmail2	|toGecersizPassword2	|
        |toGecersizEmail3	|toGecersizPassword3	|
