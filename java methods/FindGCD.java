public class FindGCD {
    public static int gcd(int x, int y){
        if(y==0) return x;
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        int gcd1 = gcd(100, 95);
        System.out.println(gcd1);
        int gcd2 = gcd(70, 49);
        System.out.println(gcd2);
    }
}
