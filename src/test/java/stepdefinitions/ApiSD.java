package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.Authentication;
import utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class ApiSD {


    @Given("Kullanici CreateBoard islemi yapmak icin {string} e post yaparak gelen status codun {int} oldugunu dogrular")
    public void kullaniciCreateBoardIslemiYapmakIcinEPostYaparakGelenStatusCodunOldugunuDogrular(String endpoint, int statuscode) {
        RestAssured.baseURI = ConfigReader.get("endpoint");
//
        given().log().all().queryParam("key", ConfigReader.get("key"))
                .header("Content-type",ContentType.JSON)
                .queryParam("token", ConfigReader.get("token"))
                .queryParam("name", "test")
                .when().get("/1/boards/")
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





}
