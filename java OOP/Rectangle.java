public class Rectangle {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.setBreadth(10);
        r1.setLength(5.5);
        double area = r1.area();
        System.out.println("Area = " + area);
    }
}
class Rect{
    private double length;
    private double breadth;

    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length > 0 ?  length : 0;
    }
    public double getBreadth(){
        return this.breadth;
    }
    public void setBreadth(double breadth){
        this.breadth = breadth > 0 ? breadth : 0.0;
    }
    public double area(){
        return length * breadth;
    }
}
