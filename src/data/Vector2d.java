package data;

/**
 * @author liwt
 */
public class Vector2d {
    public Point2d start;
    public Point2d end;

    public double getX() {
        return end.x - start.x;
    }
    public double getY() {
        return end.y - start.x;
    }
    public Vector2d() {
        this.start = new Point2d();
        this.end = new Point2d();
    }
    
    public Vector2d(Point2d start, Point2d end){
        this.start = new Point2d(start);
        this.end = new Point2d(end);
    }
    public Vector2d(Vector2d v){
        this.start =  new Point2d(v.start);
        this.end =  new Point2d(v.end);
    }
    
    public Vector2d add(Vector2d v) {
        Vector2d result = new Vector2d();
        result.start = new Point2d();
        result.end = new Point2d(getX()+v.getX(), getY()+v.getY());
        return result;
    }

    public Vector2d sub(Vector2d v) {
        Vector2d result = new Vector2d();
        result.start = new Point2d();
        result.end = new Point2d(getX()-v.getX(), getY()-v.getY());
        return result;
    }

    public Vector2d minus() {
        Vector2d result = new Vector2d();
        result.start = new Point2d();
        result.end = new Point2d(-getX(), -getY());
        return result;
    }

    public Vector2d mul(double k) {
        Vector2d result = new Vector2d();
        result.start = new Point2d();
        result.end = new Point2d(k*getX(), k*getY());
        return result;
    }

    public Vector2d div(double k) {
        Vector2d result = new Vector2d();
        result.start = new Point2d();
        result.end = new Point2d(getX()/k, getY()/k);
        return result;
    }
    public double dot(Vector2d v) {
        return getX() * v.getX() + getY()*v.getY();
    }
    public double length() {
        return Math.sqrt(lengthSquard());
    }
    public double lengthSquard() {
        return this.dot(this);
    }
    public Vector2d normalize() {
        final double len = length();
        return (len > 0) ? this.div(len) : this;
    }
    public double crossProduct(Vector2d v) {
        return getX() * v.getY() - v.getX() * getY();
    }

    public double angle(Vector2d v){
        return Math.acos(this.dot(v)/(this.length()*v.length()));
    }
    
    
    
}
