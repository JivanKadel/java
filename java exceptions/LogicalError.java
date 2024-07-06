public class LogicalError {
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            System.out.println(i);
        }
        int sum = 0;
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }

}
