import java.util.Scanner;

public class AmGmSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first term(a), common difference(d) and number of terms(n): ");
        int a = input.nextInt();
        int d = input.nextInt();
        int n = input.nextInt();

        System.out.println("The terms are: ");
        for(int i = 0; i<n ; i++){
            int term = a + i * d;
            System.out.println(term);
        }
        System.out.println("Assuming the common difference is the common ratio");

        int gm = a;
        for(int i=0; i<n; i++){
            System.out.println(gm);
            gm = gm * d;
        }
    }
}
