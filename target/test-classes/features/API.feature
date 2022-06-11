Feature: Api trello

  @hello
  Scenario: Get islemi
    Given Kullanici CreateBoard islemi yapmak icin "endpoint" e post yaparak gelen status codun 200 oldugunu dogrular

    Scenario: List Olusturma
      Given Kullanici CreateList islemi yapmak icin endpoint e post yaparak gelen status codun 200 oldugunu dogrulanır