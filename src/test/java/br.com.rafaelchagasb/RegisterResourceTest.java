package br.com.rafaelchagasb;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class RegisterResourceTest {

    @Test
    public void testRegisterEndpoint() {
        given()
          .when().get("/register")
          .then()
             .statusCode(200)
             .body(is("Registered"));
    }

}