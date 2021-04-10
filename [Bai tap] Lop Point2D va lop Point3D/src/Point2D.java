public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    ;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //Getter
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    //Setter
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    //setXY
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] getXY = {x, y};
        return getXY;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
