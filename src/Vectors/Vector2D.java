package Vectors;

public class Vector2D implements Vector
{
    Vector2D(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    protected double x,y;

    public double getx() { return x; }
    public double gety() { return y; }

    public void setx(double x) { this.x=x; }
    public void sety(double y) { this.y=y; }

    @Override
    public void abs()
    {
        if(x<0) x=x*(-1);
        if(y<0) y=y*(-1);
    }
}
