package hello;

import java.util.Map;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;

public class App implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String args[]) {
		SpringApplication.run(App.class);
	}

	public void run(String... args) throws Exception { 
		RestTemplate restTemplate = new RestTemplate(); 
		Response response = restTemplate.getForObject( "https://maps.googleapis.com/maps/api/geocode/json?address=16+Cameron+Way,+Somersworth,+NH&key=AIzaSyA0eZ-vUPVMc2Qaxs3OgSDGXaeV9Mm5wr8", Response.class); 
		log.info("==== RESTful API Response using Spring RESTTemplate START ======="); 
		log.info(response.toString()); 
		log.info("==== RESTful API Response using Spring RESTTemplate END =======");
//		Map<?, ?> m = (Map<?, ?>) response;
//		JSONObject obj = new JSONObject(m);
//		double lat = obj.getJSONArray("result").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getDouble("lat");
//		double lng = obj.getJSONArray("result").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getDouble("lng");
		Response response2 = restTemplate.getForObject( "https://maps.googleapis.com/maps/api/geocode/json?latlng=43.2828871,-70.8899385&key=AIzaSyA0eZ-vUPVMc2Qaxs3OgSDGXaeV9Mm5wr8", Response.class);
		log.info("==== RESTful API Response2 using Spring RESTTemplate START ======="); 
		log.info(response2.toString()); 
		log.info("==== RESTful API Response2 using Spring RESTTemplate END ======="); 
		}
}

//Read more:http:// javarevisited.blogspot.com/2017/02/how-to-consume-json-from-restful-web-services-Spring-RESTTemplate-Example.html#ixzz4me181A7w
