package OOP;

/**
 * @author Hammad on 19/01/2021.
 * @project Java_Masterclass
 */
public class Outlander extends Car {

    private int roadServiceMonths;

    public Outlander(int wheels, int doors, int gears, boolean isManual, int roadServiceMonths) {
        super("Outlander", "4WD", wheels, doors, gears, isManual);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity > 0 && newVelocity <= 10) {
            stop();
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(1);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(2);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }

    public static void main(String[] args) {
        Outlander outlander = new Outlander(4, 5, 6, false, 36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
