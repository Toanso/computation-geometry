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
    
    /**
     * calculate area of the triangle
     * @return
     */
    public double area(){
        Vector2d AC = new Vector2d(A, C);
        Vector2d AB = new Vector2d(A, B);
        Vector2d BC = new Vector2d(B, C);
        
        double len1 = AC.length();
        double len2 = AB.length();
        double len3 = BC.length();
        double p = 1/2*(len1+len2+len3);
        return Math.sqrt(p*(p-len1)*(p-len2)*(p-len3));
    }
    
}
