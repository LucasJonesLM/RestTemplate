package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
	
	@JsonProperty
	private Geometry geometry;
	
	

	public Results(Geometry geometry) {
		super();
		this.geometry = geometry;
	}

	public Results() {
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	@Override
	public String toString() {
		return "Results [geometry=" + geometry + "]";
	}

}

//Read more:http:// javarevisited.blogspot.com/2017/02/how-to-consume-json-from-restful-web-services-Spring-RESTTemplate-Example.html#ixzz4mdzd30W9
