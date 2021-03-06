package lab6;

import java.util.ArrayList;

public class RocketManager {
	
	String name;
	ArrayList<Rocket> RocketList = new ArrayList<Rocket>();
	Rocket currentRocket;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public ArrayList<Rocket> getRocketList(){
		return RocketList;
	}
	
	public void setRocketList (ArrayList<Rocket> newList) {
		RocketList = newList;
	}
	
	
	public void setCurrentRocket(Rocket rocket) {
		currentRocket = rocket; 
	}
	
	public Rocket getCurrentRocket() {
		return currentRocket;
	}
	
	public void launchMainScreen() {
		MainScreen mainWindow = new MainScreen(this);
	}
	
	public void closeMainScreen(MainScreen mainWindow) {
		mainWindow.closeWindow();
	}
	
	public void launchSetup() {
		Setup setupWindow = new Setup(this);
	}
	
	public void closeSetup(Setup setupWindow) {
		setupWindow.closeWindow();
		launchMainScreen();
	}
	
	
	

	public static void main(String[] args) {
		RocketManager manager = new RocketManager();
		manager.launchSetup();

	}

}
