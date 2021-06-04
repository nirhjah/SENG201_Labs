package lab4;

public class SpaceStation implements RemoteControllable{

	
	private String planet;


	public SpaceStation(String planet) {
		this.planet = planet;
		
	}
	
	public String getLocation() {
		return "The space station floats aroudn the planet " + planet;
	}
	
	
	
	
	
	
	
	
	String getStatusReport(), which returns a String of getLocation() concatenated with "The station is on a mission to: <mission>" on a new line.
	void updateMission(String mission), which updates the value of mission.
	
	
}
