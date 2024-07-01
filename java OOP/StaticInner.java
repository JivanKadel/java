class OuterClass{
    static int a = 10;
    int b = 20;
    static class InnerClass{
        void display(){
            System.out.println(a);
//            System.out.println(b); // Cannot access non-static property
        }
    }
}

public class StaticInner {
    public static void main(String[] args) {
        OuterClass.InnerClass i = new OuterClass.InnerClass();
        i.display();
    }
}
