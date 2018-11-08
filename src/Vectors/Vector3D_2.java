package Vectors;

public class Vector3D_2 extends Vector2D
{
    Vector3D_2(double x, double y, double z)
    {
        super(x,y);
        this.z=z;
    }

    private double z;

    public double getz() { return z; }
    public void setz(double z) { this.z=z; }
}
