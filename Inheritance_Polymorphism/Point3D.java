
package Inheritance_Polymorphism;

public class Point3D extends Point2D{
    int z =0;

    public Point3D() {
    }
    public Point3D(int x, int y, int z){
        super(x, y);
        this.z=z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + super.getX() + "," + super.getY() + "," + z + '}';
    }
    
}
