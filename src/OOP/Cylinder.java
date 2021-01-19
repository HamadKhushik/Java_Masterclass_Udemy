package OOP;

/**
 * @author Hammad on 19/01/2021.
 * @project Java_Masterclass
 */
public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);

        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Circle.radius= " + circle.getRadius());
        System.out.println("Circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder.radius= " + cylinder.getRadius());
        System.out.println("Cylinder.height= " + cylinder.getHeight());
        System.out.println("Cylinder.area= " + cylinder.getArea());
        System.out.println("Cylinder.volume= " + cylinder.getVolume());
    }

}
