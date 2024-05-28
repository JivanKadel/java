public class Printing {
    public static void main(String[] args) {
        int a = 10;
        char b = 'A';
        float c = 10.5F;
        System.out.println(a);
        System.out.println(c);
        System.out.println(a + c);
        System.out.println("This pushes cursor to the next line!");
        System.out.print("New line. ");
        System.out.print("Same line");
        // Formatted output
        System.out.printf("\nHello %d and %e", a, c);
        System.out.printf("\nHello %c and %f", b, (a + c));
    }
}
