import java.util.Scanner;

public class UsrInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int intInput = input.nextInt();
        System.out.println("Enter a decimal number");
        float floatInput = input.nextFloat();
        System.out.println("Enter a word");
        String strInput = input.next();
        System.out.println("Integer input : "+ intInput+ "\nFloat input : "+ floatInput+
                "\nWord input : " + strInput);
    }
}
