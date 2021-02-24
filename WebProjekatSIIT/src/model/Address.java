package model;

public class Address {
	private String streetName;
	private String streetNumber;
	private String city;
	private int postalCode;
	
	
	
	public Address() {
		super();
		
	}



	public Address(String streetName, String streetNumber, String city, int postalCode) {
		super();
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.city = city;
		this.postalCode = postalCode;
	}



	public String getStreetName() {
		return streetName;
	}



	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}



	public String getStreetNumber() {
		return streetNumber;
	}



	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	


	
	
}
