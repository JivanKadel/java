class Test1{
    static int x= 10;
    int y = 20;
    void show(){
        System.out.println(x + ", " + y);
    }
    static void displayValue(){
        System.out.println(x);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.show();
        Test1.displayValue();
        System.out.println(Test1.x);
        t1.x = 30;
        Test1 t2 = new Test1();
        System.out.println(t2.x);
        System.out.println(Test1.x);
    }
}
