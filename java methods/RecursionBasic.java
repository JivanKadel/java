public class RecursionBasic {
    public static void main(String[] args) {
        System.out.println("Print before recursive call");
        fun1(10);
        System.out.println("\nRecursive call after print");
        fun2(10);
    }
    public static void fun1(int n){
        if(n>0){
            System.out.print(n + "  ");
            fun1(n-1);
        }
    }
    public static void fun2(int n){
        if(n>0){
            fun2(n-1);
            System.out.print(n + "  ");
        }
    }
}
