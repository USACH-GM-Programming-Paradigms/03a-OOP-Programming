package org.usach.exampleinheritance;

public class Point3D extends Point2D {

    int z;

    public Point3D(int x, int y) {
        super(x, y);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
