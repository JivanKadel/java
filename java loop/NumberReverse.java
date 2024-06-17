import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int reverse = 0;
        for(int i = num; i!=0 ; i/=10){
            int digit = i % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("Reverse = " + reverse);
        if(num==reverse){
            System.out.println("It's a palindrome!");
        }else{
            System.out.println("Not a palindrome!");
        }
    }
}
