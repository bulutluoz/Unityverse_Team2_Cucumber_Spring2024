
  Feature: US1016 kullanici automation exercise sayfasinda kullanici olusturur

    @wip
    Scenario:TC22 kullanici fake bilgilerle yeni kayit olusturabilmeli
      
      Given kullanici "autoExUrl" anasayfaya gider
      And user sign up linkine tiklar
      And user Create an account bölümüne email adresi girer
      And signUp butonuna basar
      And user kisisel bilgilerini ve iletisim bilgilerini girer
      And user Create Account butonuna basar
      Then hesap olustugunu test edin
