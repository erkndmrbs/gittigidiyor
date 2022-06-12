Feature: Api trello

  @hello
  Scenario: BoardOlusturma islemi
    Given Kullanici CreateBoard islemi yapmak icin "endpoint" e post yaparak gelen status codun 200 oldugunu dogrular

    Scenario: List Olusturma
      Given Kullanici CreateList islemi yapmak icin endpoint e post yaparak gelen status codun 200 oldugunu dogrulanır

      Scenario: delete İşlemi
      Given  Kullanici deleteBoard islemi yapmak icin "endpoint" e post yaparak gelen status codun 200 oldugunu dogrulanir

        Scenario: Card olustura islemi
          Given kullanici card olusturmak icin "endpoint" e post yaparak gelen status codun 200 oldugunu dogrular
