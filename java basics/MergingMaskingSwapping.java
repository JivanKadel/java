public class MergingMaskingSwapping {
    public static void main(String[] args) {
        int a = 10, b = 6;
        System.out.println("a = 10 = " + Integer.toBinaryString(a));
        System.out.println("b = 6 = " + Integer.toBinaryString(b));
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap, a = " + a + " = " + Integer.toBinaryString(a));
        System.out.println("b = " + b + " = " + Integer.toBinaryString(b));
        b = a ^ b;
        a = a ^ b;
        b = a ^ b;
        System.out.println("Swapping further,  a = " + a + ", and b = " + b);
        byte c;
        c = (byte)(9<<4); // c -> in first 4 bits
        c = (byte) (c | 12);
        System.out.println((c&0b11110000)>>4);
        System.out.println(c&(0b00001111));
    }
}
