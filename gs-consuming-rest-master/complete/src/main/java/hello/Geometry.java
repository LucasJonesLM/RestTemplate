package hello;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {
	
	@JsonProperty
	public Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Geometry() {
		super();
	}

	public Geometry(Location location) {
		super();
		this.location = location;
	}

	@Override
	public String toString() {
		return "Geometry [location=" + location + "]";
	}

	
	
	

}
