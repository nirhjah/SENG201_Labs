package lab4;

import java.util.ArrayList;

public class SolarSystem {
	
	ArrayList<Planet> planets = new ArrayList<Planet>();

	
	public void addPlanet(Planet planet) {
		planets.add(planet);
		
	}
	
	public void printAllPlanets() {
		for(Planet planet : planets) {
			System.out.println(planet);
		}
	}
	
	
	public int getPlanetCount() {
		return planets.size();
	}

}
