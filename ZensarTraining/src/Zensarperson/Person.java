package Zensarperson;

public class Person {
	int id;
	String name;
	Vehicle vehicle;
	
	
	
	public Person(int id, String name, Vehicle vehicle) {
		this.id = id;
		this.name = name;
		this.vehicle = vehicle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	
}



