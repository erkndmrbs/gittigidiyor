package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import utilities.ConfigReader;

import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiSD {
    static String[] cardsIdArr;

    @Then("kullanici   {int} adet board olusturur")
    public void kullaniciAdetBoardOlusturur(int boardAdeti) {
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

    }


    @When("kullanici  {int} adet cart olusturur.")
    public void kullaniciAdetCartOlusturur(int cardSayisi) {
        RestAssured.baseURI = ConfigReader.get("endpoint");

        cardsIdArr = new String[cardSayisi];

        // create 2 cards
        for (int i = 0; i < cardSayisi; i++) {
            cardsIdArr[i] = given()
                    .contentType("application/json; charset=utf-8").
                    when()
                    .queryParam("key", ConfigReader.get("key"))
                    .queryParam("token", ConfigReader.get("token"))
                    .queryParam("name", "newCard" + i)
                    .queryParam("idList", "5abbe4b7ddc1b351ef961414")
                    .queryParam("desc", "initial Test Description")
                    .post("/1/cards").
                    then()
                    .statusCode(200)
                    .contentType(ContentType.JSON).
                    assertThat()
                    .body("name", equalTo("newCard" + i))
                    .extract().path("id");
        }


    }

    @Then("kullanici rastgele bir  cart i günceller")
    public void kullaniciRastgeleBirCartIGünceller() {
        //Edit one of the cards
        Random random = new Random();
        int carID = random.nextInt(2);
        RestAssured.baseURI = ConfigReader.get("endpoint");
        given()
                .contentType("application/json; charset=utf-8").
                when()
                .queryParam("key", ConfigReader.get("key"))
                .queryParam("token", ConfigReader.get("token"))
                .queryParam("name", "newCard" + carID)
                .queryParam("desc", "edited Test Description")
                .put("/1/cards/" + cardsIdArr[carID]).
                then()
                .statusCode(200)
                .contentType(ContentType.JSON).
                assertThat()
                .body("desc", equalTo("edited Test Description"))
                .extract().path("id");
    }

    @And("kullanici olusturdugu card lari siler")
    public void kullaniciOlusturduguCardLariSiler() {
        RestAssured.baseURI = ConfigReader.get("endpoint");
        for (int i = 0; i < 2; i++) {
            given()
                    .contentType("application/json").
                    when()
                    .queryParam("key", ConfigReader.get("key"))
                    .queryParam("token", ConfigReader.get("token"))
                    .delete("/1/cards/" + cardsIdArr[i]).
                    then()
                    .statusCode(200);

        }
    }

    @Then("kullanici olusturdugu bordu siler")
    public void kullaniciOlusturduguBorduSiler() {
        RestAssured.baseURI = ConfigReader.get("endpoint");

        given()
                .when()
                .queryParam("key", ConfigReader.get("key"))
                .header("Content-type", ContentType.JSON)
                .queryParam("token", ConfigReader.get("token"))
                .queryParam("name", "BoardTest")
                .delete("/1/boards").
                then()
                .statusCode(200)
                .contentType(ContentType.JSON);
    }


}
