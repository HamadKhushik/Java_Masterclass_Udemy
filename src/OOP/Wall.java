package OOP;

/**
 * @author Hammad on 18/01/2021.
 * @project Java_Masterclass
 */
public class Wall {

    private double width;
    private double height;

    public Wall() {
        this(1.0, 1.0);
    }

    public Wall(double width, double height) {
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(-1.25, -1.25);
        System.out.println("area: " + wall.getArea());

        //wall.setHeight(-1.5);
        System.out.println("wall height: " + wall.getHeight());
        System.out.println("wall width: " + wall.getWidth());
        System.out.println("wall area: " + wall.getArea());
    }
}
