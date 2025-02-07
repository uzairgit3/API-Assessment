package pack1;

/*import org.testng.annotations.Test;*/


import static io.restassured.RestAssured.*;

import java.util.HashMap;
import io.restassured.http.ContentType;

public class POST {
    public static void main(String[] args) {
        
        // Creating data for POST request
        HashMap<String, String> data = new HashMap<>();
        
        data.put("name", "scott");
        data.put("job", "Java developer");  
        data.put("City", "London");
        
        given()
            .contentType(ContentType.JSON)  
            .body(data)  
        .when()
            .post("https://reqres.in/api/users")  
        .then()
            .statusCode(201)  
            .log().all();  
    }
}
