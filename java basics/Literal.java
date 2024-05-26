public class Literal {
    public static void main(String[] args) {
        byte b1 = 10;  // Decimal
        byte b2 = 0b1010; // Binary
        byte b3 = 012;  // Octal
        byte b4 = 0xA;    // Hexadecimal
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        long l = 9_999_999_999_999_999L; // error without 'L'
        System.out.println(l);
        float f =  12.258594750945f;
        double d = 12.258594750945;
        System.out.println(f);
        System.out.println(d);
    }
}
