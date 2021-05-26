package lab4;


public class Planet {
	String name;
	int order;
	String temperature;
	
	public Planet(String name, int order, String temperature) {
		this.name = name;
		this.order = order;
		this.temperature = temperature;
	}
	
	public String orderFromSun() {
		return name + " is number " + order + " from the Sun";
		
	}
	
	
	public String getName() {
		return name;
		
	}
	
	public String getTemperature() {
		return temperature;
	}

	public String toString() {
		return orderFromSun() + " and is " + getTemperature();
		
	}
	
	public static void main(String[] args) {
		Earth earth = new Earth();
		System.out.println(earth instanceof Planet);
		System.out.println(earth);
		System.out.println(earth.home());
		
		
	}
	
	
	

}
