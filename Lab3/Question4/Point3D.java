package Lab3.Question4;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        this(0, 0, 0);
    }

    void setZ(float z) {
        this.z = z;
    }
    float getZ() {
        return z;
    }

    void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    float[] getXYZ() {
        return new float[] {super.getX(), super.getY(), z};
    }

    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}
