import java.io.*;

public class CheckedUnchecked {
    static void fileInput(){
        try{
            FileInputStream fi = new FileInputStream("my.txt");
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    static void func1(){
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    static void func2(){
        func1();
    }
    static void func3(){
        func2();
    }
    public static void main(String[] args) {
        func3();
        fileInput();
    }


}
