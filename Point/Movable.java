package Point_va_Moveable;

public class Movable extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public Movable() {

    }
    public Movable(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public Movable(float xSpeed, float ySpeed) {
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
        super.setXY(xSpeed,ySpeed);
    }
    public float[] getSpeed() {
        float[] speed = {this.getXSpeed(), this.getYSpeed()};
        return speed;
    }

    @Override
    public String toString() {
        return "Movable Point x= " + this.getX() + ", y= " + this.getY() + ", xSpeed= " + xSpeed + ", ySpeed= " + ySpeed;
    }

    public Movable move() {
        this.setX(this.getX() + this.getXSpeed());
        this.setY(this.getY() + this.getYSpeed());
        return this;
    }
}
