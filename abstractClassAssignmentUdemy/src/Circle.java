public class Circle extends Shape{

   private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2*getRadius()*Math.PI;
    }

    @Override
    double area() {
        return getRadius()*getRadius()*Math.PI;
    }
}
