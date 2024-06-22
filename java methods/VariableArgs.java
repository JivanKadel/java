public class VariableArgs {
    public static void main(String[] args) {
        findSum(1, 2, 3, 4, 5);
        findSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        findSum(new int[]{1, 2, 3, 4, 5, 6});
    }
    public static void findSum(int... args){
        int sum = 0;
        for(int x : args){
            sum += x;
        }
        System.out.println("Sum = " + sum);
    }
}
