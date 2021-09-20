package zensar_program;

public class Pen {
	int capLength;
	String brand;
	Rifill r;
	

	public Pen()
	{
		
	}

	public Pen(Rifill r, int capLength, String brand) {
         super();
		this.capLength = capLength;
		this.brand = brand;
	}

	

	public int getCapLength() {
		return capLength;
	}

	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Rifill getR() {
		return r;
	}

	public void setR(Rifill r) {
		this.r = r;
	}
	

	
}
