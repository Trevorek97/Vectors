package Vectors;

public class PolarVector
{
    PolarVector(double angle, double radius)
    {
        this.angle = angle;
        this.radius = radius;
        this.x = radius * Math.cos(angle);
        this.y = radius * Math.sin(angle);
    }

    PolarVector(Vector2D vector2D)
    {
        this.x = vector2D.getx();
        this.y = vector2D.gety();
        this.angle = Math.atan(y/x);
        this.radius = Math.sqrt(x*x+y*y);
    }

    private double x,y,angle,radius;

    public Vector2D getVector2D() { return new Vector2D(x,y); }
    public double getRadius() { return radius; }
    public double getAngle() { return angle; }
}
