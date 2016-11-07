package sample.apitests.tests;

import sample.apitests.runner.Order;
import sample.apitests.runner.OrderedRunner;
import sample.apitests.support.Setup;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;
import static org.hamcrest.Matchers.*;

@RunWith(OrderedRunner.class)
public class postmanTests extends Setup {
}
