package utils;

import data.Circle;
import data.Point2d;
import data.Triangle;
import data.Vector2d;

/**
 *
 * @author liwt
 *
 */
public class GeometryUtils {
    public static final double EPS = 1e-6;
    
    private GeometryUtils(){}
    
    /**
     * test whether a point is on the given line segment
     * @param p1
     * @param p2
     * 
     * @param Q point 
     * @return
     */
    public static boolean onSegment(Point2d p1, Point2d p2, Point2d Q){
        
        
        if(Q.sub(p1).crossProduct(p2.sub(p1))== 0
                && Math.min(p1.x, p2.x)<=Q.x
                && Math.max(p1.x, p2.x)>=Q.x
                && Math.min(p1.y, p2.y)<=Q.y
                && Math.max(p1.y, p2.y)>=Q.y)
            return true;
        return false;
    }
    /**
     * test whether a point is within a given Triangle
     * @param t
     * @param P
     * @return
     */
    public static boolean inTriangle(Triangle t, Point2d P){
        Vector2d AB = new Vector2d(t.A, t.B);
        Vector2d AC = new Vector2d(t.A, t.C);
        Vector2d PA = new Vector2d(P, t.A);
        Vector2d PB = new Vector2d(P, t.B);
        Vector2d PC = new Vector2d(P, t.C);
        
        double spab = Math.abs(PA.crossProduct(PB));
        double spac = Math.abs(PC.crossProduct(PA));
        double spbc = Math.abs(PB.crossProduct(PC));
        double sabc = Math.abs(AB.crossProduct(AC));
        if(sabc == spab + spac + spbc) return true;
        return false;
    }
    /**
     * test whether a point is within a given polygon
     * 
     * @param points
     * @param P
     * @return
     */
    public static boolean inPolygon(Point2d[] points, Point2d P){
        int len = points.length;
        double angle = 0;
        for(int i=0; i<len; i++){
            Vector2d v1 = new Vector2d(P, points[i]);
            Vector2d v2 = new Vector2d(P, points[(i+1)%len]);
            angle+= v1.angle(v2);
        }
        if(Math.abs(angle-Math.PI) <= EPS)
            return true;
        return false;
    }
    /**
     * test whether a point is within a given circle
     * @param c
     * @param p
     * @return
     */
    public static boolean inCircle(Circle c, Point2d p){
        Vector2d v = new Vector2d(p, c.center);
        double len = v.length();
        if(Math.abs(len-c.radius)<=EPS)
            return true;
        return false;
    }
    
    public static boolean segmentIntersect(Point2d p1, Point2d p2, Point2d p3, Point2d p4){
        Vector2d p12 = new Vector2d(p1, p2);
        Vector2d p34 = new Vector2d(p3, p4);
        
        Vector2d p13 = new Vector2d(p1, p3);
        Vector2d p14 = new Vector2d(p1, p4);
        
        Vector2d p31 = new Vector2d(p3, p1);
        Vector2d p32 = new Vector2d(p3, p4);
        
        double d1 = p12.crossProduct(p13);
        double d2 = p12.crossProduct(p14);
        double d3 = p34.crossProduct(p31);
        double d4 = p34.crossProduct(p32);
        
        if(d1*d2 < 0 && d3*d4 < 0) return true;
        
        
        
        
        
        
        
        return false;
    }
    

}
