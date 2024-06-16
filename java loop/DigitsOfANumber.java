import java.util.ArrayList;
import java.util.Collections;

public class DigitsOfANumber {
    public static void main(String[] args) {
        int num = 1000388;
        DigitsOfANumber don = new DigitsOfANumber();
        don.displayDigits(num);
    }
    private void displayDigits(int num){
        int count = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        for(int i=num; i>0; i/=10){
            int digit = i%10;
            digits.add(digit);
            count++;
        }
        Collections.reverse(digits);
        System.out.println("Number of digits = " + count);
        System.out.println("Digits  = " + digits );
    }
}
