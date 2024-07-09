class Area{
    private float length, breadth;
    Area(float l, float b){
        length = l;
        breadth = b;
    }
    float area() throws Exception {
        if(length<0 || breadth<0){
            throw new Exception("Dimensions cannot be negative");
        }
        return this.length * this.breadth;
    }
    void print(){
        try{
            System.out.println("Area = " + area());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class ThrowExample {
    public static void main(String[] args) {
        Area a = new Area(10.5f, -1);
        a.print();
    }
}
