public class BasicArithmetic {
    public static void main(String[] args) {
        byte num1 = 2;
        byte num2 = 4;
//        byte result = byte1 + byte2;  // error
        int result = num1 + num2;
        System.out.println(result);
        float dec1 = (int) num1 + (float) 4.0;
        System.out.println(dec1);
        double dec2 = (int) num1 + 4.0;
        System.out.println(dec2);
        System.out.println(dec1==dec2);
    }
}
