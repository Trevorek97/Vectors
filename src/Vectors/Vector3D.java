package Vectors;

public class Vector3D implements Vector
{
    Vector3D(Vector2D vector2D, double z)
    {
        this.x=vector2D.getx();
        this.y=vector2D.gety();
        this.z=z;
    }

    private double x,y,z;

    public double getx() { return x; }
    public double gety() { return y; }
    public double getz() { return z; }

    public void setx(double x) { this.x=x; }
    public void sety(double y) { this.y=y; }
    public void setz(double z) { this.z=z; }

    @Override
    public void abs()
    {
        if(x<0) x=x*(-1);
        if(y<0) y=y*(-1);
        if(z<0) z=z*(-1);
    }

    public double getScalar(Vector3D v3d) //iloczyn skalarny
    {
    return x*v3d.x + y*v3d.y + z*v3d.z;
    }

    public Vector3D getVector(Vector3D v3d) //iloczyn wektorowy
    {
    double newX = y*v3d.z - z*v3d.y;
    double newY = z*v3d.x - x*v3d.z;
    double newZ = x*v3d.y - y*v3d.x;
    return new Vector3D(new Vector2D(newX, newY), newZ);
    }
}
