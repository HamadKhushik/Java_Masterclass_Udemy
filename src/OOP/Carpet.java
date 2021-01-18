package OOP;

/**
 * @author Hammad on 18/01/2021.
 * @project Java_Masterclass
 */
public class Carpet {

    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            cost = 0;
        }
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
