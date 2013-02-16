
package data;

/**
 *
 * @author liwt
 *
 */
public class Rectangle {
    public Point2d left;
    public Point2d up;
    public Point2d right;
    public Point2d down;
    
    public Rectangle(){}
    public Rectangle(Point2d left, Point2d up, Point2d right, Point2d down){
        this.left = new Point2d(left.x, left.y);
        this.up = new Point2d(up.x, up.y);
        this.right = new Point2d(right.x, right.y);
        this.down = new Point2d(down.x, down.y);
    }
    public Rectangle(Rectangle r){
        this.left = new Point2d(r.left);
        this.up = new Point2d(r.up);
        this.right = new Point2d(r.right);
        this.down = new Point2d(r.down);
    }

}
