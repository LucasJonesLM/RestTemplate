package hello;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

	@JsonProperty
	private Object[] results;

	public Response() {
		super();
	}

	public Response(Object[] results) {
		super();
		this.results = results;
	}

	public Object[] getResults() {
		return results;
	}

	public void setResults(Object[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Response [results=" + Arrays.toString(results) + "]";
	}

	
}

//Read more:http:// javarevisited.blogspot.com/2017/02/how-to-consume-json-from-restful-web-services-Spring-RESTTemplate-Example.html#ixzz4mdz0vaqp
