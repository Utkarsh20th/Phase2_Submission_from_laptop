package phaseTWO.simplilearn.swiggy.project;

import io.restassured.http.ContentType;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class loginTwilio {

    @Test
    public void basicAuthLogin() {
        String username = "AC2d6333e734b96c343ea7904ab2c6c4f5";
        String password = "f031760dff8ce045c7d7df18a65aba08";

        //language=JSON
        String jsonBody = "";

        System.out.println(given().auth().preemptive().basic(username, password)
                .body(jsonBody)
                .contentType(ContentType.JSON)
                .when()
                .post("https://api.twilio.com/2010-04-01/Accounts/ACbf03df8b67f5a54814007271a73d05b0/Messages.json").getBody().asString());
    }
}