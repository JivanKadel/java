abstract class Shape {
    double length, breadth, radius;
    Shape(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    Shape(double radius){
        this.radius = radius;
    }
    abstract double area();
}

class Circles extends Shape{
    Circles(double radius) {
        super(radius);
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangles extends Shape{
    Rectangles(double length, double breadth) {
        super(length, breadth);
    }
    public double area(){
        return length * breadth;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Circles cr = new Circles(10);
        System.out.println("Area = " + cr.area());

        Rectangles rect = new Rectangles(10, 10);
        System.out.println("Area = " + rect.area());
    }
}
