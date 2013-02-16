package utils;

import data.Point2d;
import data.Triangle;
import data.Vector2d;

/**
 *
 * @author liwt
 *
 */
public class GeometryUtils {
    /**
     * test whether a point is on the given line segment
     * @param p1
     * @param p2
     * 
     * @param Q point 
     * @return
     */
    public boolean onSegment(Point2d p1, Point2d p2, Point2d Q){
        
        
        if(Q.sub(p1).crossProduct(p2.sub(p1))== 0
                && Math.min(p1.x, p2.x)<=Q.x
                && Math.max(p1.x, p2.x)>=Q.x
                && Math.min(p1.y, p2.y)<=Q.y
                && Math.max(p1.y, p2.y)>=Q.y)
            return true;
        return false;
    }
    /**
     * test whether a point is in the given Triangle
     * @param t
     * @param P
     * @return
     */
    public boolean inTriangle(Triangle t, Point2d P){
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
    

}
