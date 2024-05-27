public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 1;
        float b = 1.1f;
        char c = 'A';
        byte d = 1;
        System.out.println("a = 1, ++a is " + ++a);
        System.out.println("b = 1.1 , ++b is " + ++b);
        System.out.println("c = A, ++c is " + ++c);
        System.out.println("d = 1, ++d is " + ++d);

        // bitwise operators
        int x = 6, y = 10;
        int xAndY = x & y;
        int xOrY = x | y;
        int xExOrY = x^y;
        System.out.println("x = " + x + " = " + Integer.toBinaryString(x));
        System.out.println("y = "  + y + " = " + Integer.toBinaryString(y));
        System.out.println("x & y =  "  + xAndY + " = " + Integer.toBinaryString(xAndY));
        System.out.println("x | y =  "  + xOrY + " = " + Integer.toBinaryString(xOrY));
        System.out.println("x ^ y =  "  + xExOrY + " = " + Integer.toBinaryString(xExOrY));
        System.out.println("y<<1 =  "  + (y<<1) + " = " + Integer.toBinaryString(y<<1));
        System.out.println("y<<2 =  "  + (y<<2) + " = " + Integer.toBinaryString(y<<2));
        System.out.println("y<<3 =  "  + (y<<3) + " = " + Integer.toBinaryString(y<<3));
        System.out.println("y>>1 =  "  + (y>>1) + " = " + Integer.toBinaryString(y>>1));
        System.out.println("y>>2 =  "  + (y>>2) + " = " + Integer.toBinaryString(y>>2));
        System.out.println("y>>3 =  "  + (y>>3) + " = " + Integer.toBinaryString(y>>3));

        // Signed values shift
        int n = -10;
        System.out.println("n = " + n + " = " + Integer.toBinaryString(n));
        System.out.println("n<<1 =  "  + (n<<1) + " = " + Integer.toBinaryString(n<<1));
        System.out.println("n<<2 =  "  + (n<<2) + " = " + Integer.toBinaryString(n<<2));
        System.out.println("n>>1 =  "  + (n>>1) + " = " + Integer.toBinaryString(n>>1));
        System.out.println("n>>2 =  "  + (n>>2) + " = " + Integer.toBinaryString(n>>2));
        System.out.println("n>>>1 =  "  + (n>>>1) + " = " + Integer.toBinaryString(n>>>1));
        System.out.println("~n =  "  + (~n) + " = " + Integer.toBinaryString(~n));
    }
}
