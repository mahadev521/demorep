package homeTasks;

public class Employee {
//Employee class which holds attributes of employee
	private int empId, salary;
	private String name;
	private Address address;
	// constructor

	Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
	}

	Employee(int empId, String name, int salary, Address address) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getempId() {
		return empId;
	}

	public void setempId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFloorNumber() {
		return address.getFloorNumber();
	}

	public void setFloorNumber(String floorNumber) {
		address.setFloorNumber(floorNumber);
	}

	public String getStreetName() {
		return address.getStreetName();
	}

	public void setStreetName(String streetName) {
		address.setStreetName(streetName);
	}

	public String getCityName() {
		return address.getCityName();
	}

	public void setCityName(String cityName) {
		address.setCityName(cityName);
		;
	}

	public String getState() {
		return address.getState();
	}

	public void setState(String state) {
		address.setState(state);
		;
	}

	public String getCountry() {
		return address.getCountry();
	}

	public void setCountry(String country) {
		address.setCountry(country);
	}

	public void printDetails() {
		System.out.println("Name: " + getName());
		System.out.println("EmpId: " + getempId());
		System.out.println("Salary: " + getSalary());
		if (address == null) {
			System.out.println("Address is not specified");
		} else {

			System.out.println("Address\n" + getAddress());
		}
	}
}
