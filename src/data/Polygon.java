
package data;

/**
 *
 * @author liwt
 *
 */
public class Polygon {

    public Point2d points[];
    public Polygon(){}
    public Polygon(Point2d points[]){
        int length = points.length;
        this.points = new Point2d[length];
        for(int i=0; i<points.length; i++){
            this.points[i] = new Point2d(points[i]);
        }
    }
    public Polygon(Polygon p){
        int length = p.points.length;
        this.points = new Point2d[length];
        for(int i=0; i<length; i++){
            this.points[i] = new Point2d(p.points[i]);
        }
    } 
    
    /**
     * calculate area of the polygon 
     * @return
     */
    public double area(){
        double result = 0.0;
        for(int i=1; i<this.points.length-1; i++){
            result+= this.points[i].sub(this.points[0]).crossProduct(this.points[i+1].sub(this.points[0]));
        }
        return Math.abs(result)/2;
    }
}
