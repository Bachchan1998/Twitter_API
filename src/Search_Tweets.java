import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

public class Search_Tweets {

	String ConsumerKey="2Xtd4ILUtinfACHehAvCNcbjW";
	String ConsumerSecret="pIHDmJy9fgKlLVuAgG4AuP5rRkaOy6TtWqxLqjVeJ2MywdcGJp";
	String Token="839104214-h1Kaf8iJW2FAyXzNCZNicI1a4Xb8BMw7ZkFKGzmJ";
	String TokenSecret="PTvXawkmrK3EZWeLSSmqtD7hisogRC3nqG48FYzNcLfQy";
	@Test
	public void search_Tweet()
	{
		RestAssured.baseURI="https://api.twitter.com/1.1/search/";
		Response res=given().auth().oauth(ConsumerKey, ConsumerSecret, Token, TokenSecret).
		queryParam("q","Qualitest")
		.when().get("/tweets.json").then().extract().response();
		
		String response=res.asString();
		System.out.println(response);
		/*JsonPath js=new JsonPath(response);
		String id=js.get("id").toString();
		System.out.println(id); 
		String text=js.get("text").toString();
		System.out.println(text);*/
		
		
		
	
	}
	
}
