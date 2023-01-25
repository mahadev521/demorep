package homeTasks;

public class Address {
//	The Address has Floor number, Street Name, City Name, State, and Country.
	private String floorNumber, streetName, cityName, state, country;

	Address(String floorNumber, String streetName, String cityName, String state, String country) {
		this.floorNumber = floorNumber;
		this.streetName = streetName;
		this.cityName = cityName;
		this.state = state;
		this.country = country;
	}

	public String getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return String.format("Floor number %s\nStreet: %s\nCity: %s\nState: %s\nCountry: %s\n", floorNumber, streetName,
				cityName, state, country);
	}

}
