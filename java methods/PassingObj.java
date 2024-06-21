import java.util.Arrays;

public class PassingObj {
    static void changeArr(int[] arr){
        arr[0] = 0;
        arr[1] = 5;
    }
    static String changeStr(String str){
        str = "New String";
        return str;
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 10, 15, 20};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
        String str = "Old String" ;
        str = changeStr(str);
        System.out.println(str);
    }
}
