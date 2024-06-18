import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms ");
        int n = input.nextInt();
        int term = 0, n1 = 0, n2= 1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=0; i<n-2; i++){
            term = n1 + n2;
            System.out.println(term);
            n1 = n2;
            n2 = term;
        }
    }
}
