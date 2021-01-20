package OOP;

/**
 * @author Hammad on 20/01/2021.
 * @project Java_Masterclass
 */
public class BedroomLamp {

    private String style;
    private boolean battery;
    private int globRating;

    public BedroomLamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
