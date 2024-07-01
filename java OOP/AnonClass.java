abstract class AClass{
    abstract void display();
}
interface BClass{
    void display();
}
public class AnonClass {
    public static void main(String[] args) {
        AClass ac = new AClass(){
            @Override
            void display() {
                System.out.println("Inside the Anon class");
            }
        };
        ac.display();
        BClass bc = new BClass() {
            @Override
            public void display() {
                System.out.println("Inside the Anon class again!");
            }
        };
        bc.display();
    }
}
