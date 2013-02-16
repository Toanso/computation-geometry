package data;

/**
 * @author liwt
 */
public class Point2d {
    public double x;

    public double y;

    public Point2d() {
        this.x = 0;
        this.y = 0;
    }

    public Point2d(Point2d v) {
        this.x = v.x;
        this.y = v.y;
    }

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2d add(Point2d v) {
        return new Point2d(x + v.x, y + v.y);
    }

    public Point2d sub(Point2d v) {
        return new Point2d(x - v.x, y - v.y);
    }

    public Point2d minus() {
        return new Point2d(-x, -y);
    }

    public Point2d mul(double k) {
        return new Point2d(x * k, y * k);
    }

    public Point2d div(double k) {
        return new Point2d(x / k, y / k);
    }

    public double crossProduct(Point2d p) {
        return x * p.y - p.x * y;
    }

}
