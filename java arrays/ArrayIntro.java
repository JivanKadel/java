import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Using for loop: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nUsing for-each loop");
        for(int x: arr){
            System.out.print(x + "\t");
        }
        System.out.println("\n" + Arrays.toString(arr));
    }
}
