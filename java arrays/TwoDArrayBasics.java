public class TwoDArrayBasics {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){
                arr[i][j] = i + j;
            }
        }
        for(int[] x : arr){
            for(int y : x){
                System.out.print(y + "   ");
            }
            System.out.println();
        }

        System.out.println("Now, jagged array");
        int[][] jaggedArr;
        jaggedArr = new int[3][];
        jaggedArr[0] = new int[3];
        jaggedArr[1] = new int[5];
        jaggedArr[2] = new int[4];
        for (int[] x : jaggedArr){
            for(int y : x){
                System.out.print(y + "   ");
            }
            System.out.println();
        }
    }
}
