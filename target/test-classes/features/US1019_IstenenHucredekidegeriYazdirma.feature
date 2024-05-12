

Feature: US1019 isteden datayi yazdirma

  Scenario: TC25 kullanici satir ve sutun degeri ile istenen datayi yazdirabilmeli

    Given kullanici "guruUrl" anasayfaya gider
    And 4. satir , 1.sutundaki datayi yazdirir
    And 10 saniye bekler

