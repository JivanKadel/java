import java.util.Scanner;
import static java.lang.Math.sqrt;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the length of three sides");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double s = (a + b + c) / 2 ;
        double area = sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.print("Area of the triangle is : "+ String.format("%.2f", area));
    }
}
