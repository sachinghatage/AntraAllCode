package saturday;

public class Car {

	
	protected int wheelCount;
	public int getWheelCount() {
		return wheelCount;
	}

	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	private String vin;
	public Car(String vin) 
	{
		
		this.wheelCount = 4;
		this.vin = vin;
	}
	
	public String drive() {
		return "zoom";
	}
	
	public String getInfo() {
		return vin+"  "+wheelCount;
	}
	
}

class MeGo extends Car
{
	
	 

	public MeGo(String vin) {
		super(vin);
		this.wheelCount=3;
		
	}
	
}