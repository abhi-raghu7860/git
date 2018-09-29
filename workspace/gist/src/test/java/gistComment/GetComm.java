package gistComment;
import io.restassured.*;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetComm {
  @Test
  public void testResponsecode() {
	  Response resp=RestAssured.get("https://gist.github.com/abhi-raghu7860/97adb2c89af6e84a3d7c404d3a19f200");
		int code=resp.getStatusCode();
		System.out.println("Status codde is "+code);
		Assert.assertEquals(code,200);
  }
  
  @Test
  public void testbody() {
	  Response resp=RestAssured.get("https://gist.github.com/abhi-raghu7860/97adb2c89af6e84a3d7c404d3a19f200");
		String data=resp.asString();
		System.out.println(data);
	}
  
  @Test
  public void timetaken() {
	  Response resp=RestAssured.get("https://gist.github.com/abhi-raghu7860/97adb2c89af6e84a3d7c404d3a19f200");
		long data=resp.getTime();
		System.out.println("Time taken is "+data);
		
	}
}
