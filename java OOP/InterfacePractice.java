interface RealShape{
    void area();
    void perimeter();
}

class Circular implements RealShape{
    private final double radius;
    Circular(double radius){
        this.radius = radius;
    }
    public void area(){
        System.out.println(Math.PI * radius * radius);
    }
    public void perimeter(){
        System.out.println(2 * Math.PI * radius);
    }
}

public class InterfacePractice{
    public static void main(String[] args) {
        Circular cl = new Circular(10);
        cl.area();
        cl.perimeter();
    }
}
