package lab6;

public class Rocket {
	
	
	private String rocketName;
	private String fuel;
	private String cleanliness;
	
	public Rocket(String rocketName, String fuel, String cleanliness) {
		this.rocketName = rocketName;
		this.fuel = fuel;
		this.cleanliness = cleanliness;
	}
	
	
	public String getRocketName() {
		return rocketName;
	}
	public void setRocketName(String rocketName) {
		this.rocketName = rocketName;
	}
	public String getFuel() {
		return fuel;
	}
	public void setCleanliness(String cleanliness) {
		this.cleanliness = cleanliness;
	}
	public String getCleanliness() {
		return cleanliness;
	}
	

	public String toString() {
		//return("Name: " + rocketName + "Fuel level: " + fuel + "Clean: " + cleanliness);
		return(rocketName + ", " + fuel + ", " + cleanliness);

	}

}
