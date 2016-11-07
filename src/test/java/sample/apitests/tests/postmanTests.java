package sample.apitests.tests;

import sample.apitests.runner.Order;
import sample.apitests.runner.OrderedRunner;
import sample.apitests.support.Setup;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@RunWith(OrderedRunner.class)
public class postmanTests extends Setup {

    @Test
    @Order(order = 1)
    public void getResponseStatusCode() throws Exception {

        given().get("/status/200").then().
                assertThat().statusCode(200).
                assertThat().body(containsString("status"));
    }

    @Test
    @Order(order = 2)
    public void getRequest() throws Exception {

        given().get("/get?test=123").then().
                assertThat().statusCode(200).
                assertThat().body(containsString("test")).
                assertThat().body(containsString("host"));
    }
}
