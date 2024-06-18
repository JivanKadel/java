import java.util.Arrays;
import java.util.List;

public class ArrayMinMaxSearch {
    public static void main(String[] args) {
        int[] arr = {3, 9, 17, 8, 16, 6, 17, 5, 4, 10};
        ArrayMinMaxSearch obj = new ArrayMinMaxSearch();
        obj.findSum(arr);
        obj.searchElement(5, arr);
        obj.findMax(arr);
        obj.secondMax(arr);
    }
    public void findSum(int[] arr){
        int sum = 0;
        for(int element: arr){
            sum += element;
        }
        System.out.println("Sum = " + sum);
    }
    public void searchElement(int num, int[] arr){
        for(int i=0; i<arr.length; i++){
            if(num==arr[i]){
                System.out.println("Fount " + num + " at index " + i);
                return;
            }
        }
        System.out.println("Not found!");
    }

    public void findMax(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num>max){
                max = num;
            }
        }
        System.out.println("Max = " + max);
    }

    public void secondMax(int[] arr){
        int max1, max2 ;
        max1 = max2 = arr[0];
        for(int x : arr){
            if(x>max1) {
                max2 = max1;
                max1 = x;
            }
            else if(x>max2 && x!=max1){
                max2 = x;
            }
        }
        System.out.println("Second largest number = " + max2);
    }
}
