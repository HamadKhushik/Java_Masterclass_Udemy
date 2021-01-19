package OOP;

/**
 * @author Hammad on 19/01/2021.
 * @project Java_Masterclass
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}
