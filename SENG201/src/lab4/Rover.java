package lab4;

public class Rover implements RemoteControllable{
	
	private double longitude;
	private double latitude;

	
	
	public void setLocation(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		
	}
	
	
	public String getLocation() {
		
		return "The rover is located " + latitude +  ", " + longitude +  " on the planet.";
		
	}
	
	
	
	public String getStatusReport() {
		return "The rover is driving to:" + "\n" + getLocation(); 
	}
	
	
	public void updateMission(String mission) {
		
	}
	
}
