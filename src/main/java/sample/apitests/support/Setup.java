package sample.apitests.support;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Setup {

    public static final String URI = "https://echo.getpostman.com";

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = URI;
    }
}
