package Point2D;

public class Point2D {
    private float x = 0;
    private float y = 0;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] newArray = new float[2];
        newArray[0] = this.getX();
        newArray[1] = this.getY();
        return newArray;
    }

    @Override
    public String toString() {
        return "("
                + getXY()[0]
                + " , "
                + getXY()[1]
                + ")";
    }
}
