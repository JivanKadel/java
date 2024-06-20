import java.util.Arrays;

public class RotateInsertDelete {
    public static void main(String[] args) {
        int[] arr = {5, 9, 6, 10, 7, 3, 12, 5, 2};
        rotateLeft(arr);
        rotateRight(arr);
        insertIntoArray(arr, 9, 7);
        deleteFromArray(arr, 4);
    }
    public static void rotateLeft(int[] arr){
        int temp = arr[0];
        for(int i=0; i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateRight(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void insertIntoArray(int[] arr, int num, int index){
        int[] temp = new int[arr.length+1];
        for(int i=temp.length-1; i>=0; i--){
            if(i>index) temp[i] = arr[i-1];
            else temp[i] = arr[i];
        }
        temp[index] = num;
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void deleteFromArray(int[] arr, int index){
        int[] temp = new int[arr.length-1];
        for(int i=0; i<arr.length; i++){
            if(i>index){
                temp[i-1] = arr[i];
            }
            else{
                temp[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
