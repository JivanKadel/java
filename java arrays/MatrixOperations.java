import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int size = input.nextInt();
        int[][] first = new int[size][size];
        int[][] second = new int[size][size];
        matrixInput(first, size, input);
        matrixInput(second, size, input);
        add(first, second);
    }

    public static void add(int[][] first, int[][] second){
        int[][] result= new int[first.length][first[0].length];

        for(int i=0; i<first.length; i++){
            for(int j=0; j<first[0].length; j++){
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        System.out.println("The resulting matrix after addition is : ");
        printMatrix(result);
    }

    public static  void matrixInput(int[][] matrix, int size, Scanner input){
        System.out.printf("Enter %d * %d elements for the matrix : ", size, size);
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j] = input.nextInt();
            }
        }
    }

    public static  void printMatrix(int[][] result){
        for(int[] row : result){
            for(int num : row){
                System.out.print(num + " | ");
            }
            System.out.println();
        }
    }
}
