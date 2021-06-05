package lab3;

public class GreenAlienDesc {

    private String name;
    private int eyeCount;
    private String favouriteCandy;

    public GreenAlienDesc() {
        name = "Kloup";
        eyeCount = 6;
        favouriteCandy = "Lollypops";
    }

    public GreenAlienDesc(String tempName, int tempEye, String tempCandy) {
        name = tempName;
        eyeCount = tempEye;
        favouriteCandy = tempCandy;
    }

    public String toString() {
        return String.format("This Alien is called %s and has %d eyes. Gross. It seems to enjoy eating %s",
                name, eyeCount, favouriteCandy);
    }

}