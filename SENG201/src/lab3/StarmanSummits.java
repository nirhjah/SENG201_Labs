package lab3;

public class StarmanSummits {
	
	private double distanceClimbed = 0;
	private int counter = 0;
	
	
	public void climbMountain(double height, double dash, double slide) {
		
		while(distanceClimbed < height) {
			counter += 1;
			distanceClimbed += dash;
			 if(distanceClimbed >= height) {
		            break;
			 }
		    distanceClimbed -= slide;
		
			
		}
	System.out.println("Starman needs to dash " + counter + " times before he reaches the top of the mountain");
		
	}

	public static void main(String[] args) {
		
		StarmanSummits starman = new StarmanSummits();
		starman.climbMountain(10, 2, 1);

	}

}
