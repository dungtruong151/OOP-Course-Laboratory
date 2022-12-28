public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point target)   {
        return Math.sqrt((this.x - target.x)*(this.x -target.x) + (this.y - target.y)*(this.y - target.y));     
    }
}
