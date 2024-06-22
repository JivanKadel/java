public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(max(2, 3));
        System.out.println(max(2.1f, 3));
        System.out.println(max(2, 3, 5));
    }
    public static int max(int x, int y){
        return (x > y) ? x : y;
    }
    public static float max(float x, float y){
        return (x > y) ? x : y;
    }
    public static int max(int x, int y, int z){
        return (x > y && x > z) ? x : ( y > z ? y : z);
    }
}
