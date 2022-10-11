public class Rectangle extends Shape{

    public Rectangle(double length,double breadth){
        this.breadth= breadth;
        this.length=length;
    }

    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    double perimeter() {
        return 2*(getBreadth()+getLength());
    }

    @Override
    double area() {
        return getLength()*getBreadth();
    }
}
