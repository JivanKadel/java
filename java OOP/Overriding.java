class Super{
    public void display(){
        System.out.println("Super class");
    }
}
class Sub extends Super{
    @Override
    public void display() {
        System.out.println("Sub class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub sb = new Sub();
        sb.display();

        Super sp = new Sub();
        sp.display();
    }
}
