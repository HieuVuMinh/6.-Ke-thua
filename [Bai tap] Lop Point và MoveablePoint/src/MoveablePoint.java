public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    ;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] getSpeed = {xSpeed, ySpeed};
        return getSpeed;
    }

    public MoveablePoint move() {
        float x = getX();
        x += xSpeed;
        setX(x);
        float y = getY();
        y += ySpeed;
        setY(y);
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" + "x = " + getX() + ", y = " + getY() + ", " +
                "xSpeed = " + xSpeed + ", ySpeed = " + ySpeed + '}';
    }
}
