package lab3;

public class LiftoffWatch {
	
	private double temperature;
	private double wind;
	private String weather;

	
	public void setTemp(double temp) {
		temperature = temp;
	}
	
	public void setWeather(String state) {
		weather = state;
	}
	
	
	public void setWind(double speed) {
		wind = speed;
	}
	
	public boolean canWeLaunch() {
		if(temperature >= 16.5 && temperature <= 34.0) {
			if(weather == "Sunny") {
				if(wind <= 60) {
					return true;
				}
				
			}
			if(weather == "Cloudy") {
				if(wind <= 45) {
					return true;
				}
				
			}
			if(weather == "Rainy") {
				return false;
	
			}	
			
		}
		else {
			return false;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		

	}

}
