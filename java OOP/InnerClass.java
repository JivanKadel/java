class Outer{
    int x = 10;
    void outer(){
        System.out.println("Outer " + x );
        Inner inside = new Inner();
        inside.inner();
    }
    class Inner{
        int y = 20;
        void inner(){
            System.out.println("Inner " + x + " " + y);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer ot = new Outer();
        ot.outer();
        Outer.Inner i = new Outer().new Inner();
        i.inner();
        System.out.println(i.y);
    }
}
