package hello;

public class Address {
	
	String street_number;
	String street_name;
	String city;
	String state;
	String zip;
	public String getStreet_number() {
		return street_number;
	}
	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [street_number=" + street_number + ", street_name=" + street_name + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	
}
