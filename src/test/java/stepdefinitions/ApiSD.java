package stepdefinitions;


import com.mashape.unirest.http.exceptions.UnirestException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.junit.BeforeClass;
import utilities.ConfigReader;




import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiSD {


    @Given("Kullanici CreateBoard islemi yapmak icin {string} e post yaparak gelen status codun {int} oldugunu dogrular")
    public void kullaniciCreateBoardIslemiYapmakIcinEPostYaparakGelenStatusCodunOldugunuDogrular(String endpoint, int statuscode) {
        RestAssured.baseURI = ConfigReader.get("endpoint");
//
        given().log().all().queryParam("key", ConfigReader.get("key"))
                .header("Content-type",ContentType.JSON)
                .queryParam("token", ConfigReader.get("token"))
                .queryParam("name", "test")
                .when().post("/1/boards/")
                .then().assertThat().statusCode(statuscode);
    }

    @Given("Kullanici CreateList islemi yapmak icin endpoint e post yaparak gelen status codun {int} oldugunu dogrulanır")
    public void kullaniciCreateListIslemiYapmakIcinEndpointEPostYaparakGelenStatusCodunOldugunuDogrulanır(int statusCode) {
        RestAssured.baseURI = ConfigReader.get("endpoint");

        given().log().all().queryParam("key", ConfigReader.get("key"))
                .header("Content-type",ContentType.JSON)
                .queryParam("token", ConfigReader.get("token"))
                .queryParam("idBoard", "5abbe4b7ddc1b351ef961414")
                .queryParam("name", "testList")
                .when().post("1/lists")

                .then().log().all().assertThat().statusCode(statusCode);
    }

    @Given("Kullanici deleteBoard islemi yapmak icin {string} e post yaparak gelen status codun {int} oldugunu dogrulanir")
    public void kullanici_deleteBoard_islemi_yapmak_icin_e_post_yaparak_gelen_status_codun_oldugunu_dogrulanir(String string, Integer int1) {
        RestAssured.baseURI = ConfigReader.get("endpoint");

      //  Response response = given()
      //          .header("Content-type", "application/json")
      //          .pathParam("id", Boardid)
      //          .when()
      //          .delete("/1/boards/{id}")
      //          .then()
      //          .extract().response();

      //  Assert.assertEquals(200, response.statusCode());

    }


    @Given("kullanici card olusturmak icin {string} e post yaparak gelen status codun {int} oldugunu dogrular")
    public void kullaniciCardOlusturmakIcinEPostYaparakGelenStatusCodunOldugunuDogrular(String arg0, int statusCode) throws UnirestException {
      RestAssured.baseURI = ConfigReader.get("endpoint");
      given().log().all().queryParam("key", ConfigReader.get("key"))
              .header("Content-type", ContentType.JSON)
              .queryParam("token", ConfigReader.get("token"))
              .queryParam("idList", "5abbe4b7ddc1b351ef961414")
              .queryParam("name","test1")
              .when().post("/1/cards")
              .then().log().all().assertThat().statusCode(statusCode);

    //   HttpResponse<JsonNode> response = Unirest.post("https://api.trello.com/1/cards")
    //           .header("Accept", "application/json")
    //           .queryString("idList", "5abbe4b7ddc1b351ef961414")
    //           .queryString("key", ConfigReader.get("key"))
    //           .queryString("token", ConfigReader.get("token"))
    //           .asJson();

    //   System.out.println(response.getBody());

    }


    @Given("kullanici olusturmak istedigini board ve card icin gerekli olan ID leri alir")
    public void kullaniciOlusturmakIstediginiBoardVeCardIcinGerekliOlanIDLeriAlir() {

    }
    public String createBoardAndListThenGetTheListID(){
        RestAssured.baseURI = ConfigReader.get("endpoint");
        String boardId =
                given().log().all()
                        .when()
                        .queryParam("key", ConfigReader.get("key"))

                        .queryParam("token", ConfigReader.get("token"))
                        .queryParam("name", "BoardTest")
                        .post("/1/boards").
                        then()
                        .statusCode(200)
                        .assertThat()
                        .body("name", equalTo("BoardTest"))
                        .extract().path("id");

        String listId =
                given()
                        .contentType("application/json; charset=utf-8")
                        .when()
                        .queryParam("key", ConfigReader.get("key"))
                        .queryParam("token", ConfigReader.get("token"))
                        .queryParam("name","TestList")
                        .post("/boards/"+boardId+"/lists")
                        .then()
                        .statusCode(200)
                        .contentType(ContentType.JSON)
                        .assertThat()
                        .body("name", equalTo("TestList"))
                        .extract().path("id");
        return listId;
    }

    @Then("kullanici aldigi boardID ile  {int} adet board olusturur")
    public void kullaniciAldigiBoardIDIleAdetBoardOlusturur(int boardAdeti) {
        RestAssured.baseURI = ConfigReader.get("endpoint");

        given()
                .contentType("application/json; charset=utf-8").
                when()
                .queryParam("key", ConfigReader.get("key"))
                .header("Content-type", ContentType.JSON)
                .queryParam("token", ConfigReader.get("token"))
                .queryParam("name", "BoardTest")
                .post("/1/boards").
                then()
                .statusCode(200)
                .contentType(ContentType.JSON);
               // assertThat()
                //.body("name", equalTo("BoardTest"));

    }

    @When("kullanici aldigi id ile {int} adet cart olusturur.")
    public void kullaniciAldigiIdIleAdetCartOlusturur(int cardSayisi) {
        RestAssured.baseURI = ConfigReader.get("endpoint");
        String listId = createBoardAndListThenGetTheListID();
        String[] cardsIdArr = new String[cardSayisi];

        // create 2 cards
        for (int i = 0; i < cardSayisi; i++) {
            cardsIdArr[i] = given()
                    .contentType("application/json; charset=utf-8").
                    when()
                    .queryParam("key", ConfigReader.get("key"))
                    .queryParam("token", ConfigReader.get("token"))
                    .queryParam("name","newCard"+i)
                    .queryParam("idList",listId)
                    .queryParam("desc","initial Test Description")
                    .post("/cards").
                    then()
                    .statusCode(200)
                    .contentType(ContentType.JSON).
                    assertThat()
                    .body("name", equalTo("newCard"+i))
                    .extract().path("id");
        }


        //Edit one of the cards
        given()
                .contentType("application/json").
                when()
                .queryParam("key", ConfigurationReader.getProperty("key"))
                .queryParam("token", ConfigurationReader.getProperty("token"))
                .queryParam("name","newCard0")
                .queryParam("desc","edited Test Description")
                .put("/cards/"+cardsIdArr[0]).
                then()
                .statusCode(200)
                .contentType(ContentType.JSON).
                assertThat()
                .body("desc", equalTo("edited Test Description"))
                .extract().path("id");

        //Delete one of the cards
        given()
                .contentType("application/json").
                when()
                .queryParam("key", ConfigurationReader.getProperty("key"))
                .queryParam("token", ConfigurationReader.getProperty("token"))
                .delete("/cards/"+cardsIdArr[1]).
                then()
                .statusCode(200);

        //Add a comment to one of the cards
        given()
                .contentType("application/json").
                when()
                .queryParam("key", ConfigurationReader.getProperty("key"))
                .queryParam("token", ConfigurationReader.getProperty("token"))
                .queryParam("text","testComment")
                .post("/cards/"+cardsIdArr[2]+"/actions/comments").
                then()
                .statusCode(200);
    }

    }

}
