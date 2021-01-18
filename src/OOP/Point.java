package OOP;

/**
 * @author Hammad on 18/01/2021.
 * @project Java_Masterclass
 */
public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private double calcDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public double distance() {
        return calcDistance(this.x, this.y, 0, 0);
    }

    public double distance(int x, int y) {
        return calcDistance(this.x, this.y, x, y);
    }

    public double distance(Point p) {
        return calcDistance(this.x, this.y, p.getX(), p.getY());
    }

    public static void main(String[] args) {
        Point p1 = new Point(-1, -1);
        System.out.println("Distance is " + p1.distance());
    }
}
