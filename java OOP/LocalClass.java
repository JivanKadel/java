public class LocalClass {
    public static void main(String[] args) {
        class Local{
            void innerDisplay(){
                System.out.println("This is inside the method");
            }
        }
        Local l = new Local();
        l.innerDisplay();
    }
}
