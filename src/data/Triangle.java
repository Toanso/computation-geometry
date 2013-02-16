package data;

/**
 *
 * @author liwt
 *
 */
public class Triangle {
    public Point2d A;
    public Point2d B;
    public Point2d C;
    public Triangle(){}
    public Triangle(Point2d a, Point2d b, Point2d c){
        A = new Point2d(a);
        B = new Point2d(b);
        C = new Point2d(c);
    }
    public Triangle(Triangle t){
        A = new Point2d(t.A);
        B = new Point2d(t.B);
        C = new Point2d(t.C);
    }
}
