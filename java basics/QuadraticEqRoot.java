import java.util.Scanner;

public class QuadraticEqRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients i.e. a, b, and c for ax^2 + bx + c = 0");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float determinant  = b * b - (4 * a * c);
        float root2;
        float root1 = root2 =  0.0f;
        if(determinant<0){
            System.out.println("The roots are imaginary.");
            return;
        }
        root1 = (float) ((-b + Math.sqrt(determinant)) / (2 * a));
        root2 = (float) ((-b - Math.sqrt(determinant)) / (2 * a));
        System.out.println("The roots are: " +  String.format("%.2f", root1) + ", and " +  String.format("%.2f", root2));
    }
}
