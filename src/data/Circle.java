package data;

/**
 * @author liwt
 */
public class Circle {

    public Point2d center;

    public double radius;

    public Circle() {
        center = new Point2d();
    }

    public Circle(double radius) {
        center = new Point2d();
        this.radius = radius;
    }

    public Circle(Point2d center, double radius) {
        this.center = new Point2d(center.x, center.y);
        this.radius = radius;
    }

    public Circle(Circle c) {
        this.center = new Point2d(c.center.x, c.center.y);
        this.radius = c.radius;
    }
}
