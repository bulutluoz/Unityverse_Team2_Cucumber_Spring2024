
  Feature: US1011 liste olarak verilen tum urunler sitede bulunabilmeli


    Scenario Outline: TC17 liste olarak verilen urunlerin
                           herbiri icin arama yapildiginda urun bulunabilmeli
      # aranacak kelimeler phone, java, dress, iphone, nutella

      Given kullanici "toUrl" anasayfaya gider
      Then arama kutusuna "<aranacakKelimeler>" yazip enter tusuna basar
      And arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir

      Examples:
      |aranacakKelimeler|
      |phone            |
      |java             |
      |dress            |
      |iphone           |
      |nutella          |