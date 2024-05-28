public class FormattedOutput {
    public static void main(String[] args) {
        int a = 10, d = -10;
        char b = 'A';
        float c = 1000.4573F;
        // argument index
        System.out.println("Positive");
        System.out.printf("%d", a);
        System.out.printf("\n%5d", a);
        System.out.printf("\n%(5d", a);
        System.out.println("\nNegative");
        System.out.printf("%5d", d);
        System.out.printf("\n%05d", d);
        System.out.printf("\n%(5d", d);
        System.out.printf("\n%05d", a);
        System.out.println("\nFloat");
        System.out.printf("%f", c);
        System.out.printf("\n%5f", c);
        System.out.printf("\n%5.2f", c);
        System.out.println("\nCombined");
        System.out.printf("%1$d %1$d %2$e %1$d", a, (a + c));
    }
}
