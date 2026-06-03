public class Point {
    private int x;
    private int y;
    public Point() {
        this(0, 0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return distance(0, 0);
    }
    public double distance(Point other) {
        return distance(other.getX(), other.getY());
    }
    public double distance(int x, int y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
