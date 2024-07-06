public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            int[] arr = {10, 0, 5, 6, 8};
            try{
                int q = arr[0] / arr[1];
                System.out.println(q);
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
