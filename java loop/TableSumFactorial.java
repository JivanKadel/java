public class TableSumFactorial {
    public static void main(String[] args) {
        TableSumFactorial tsf = new TableSumFactorial();
        tsf.multiplicationTable(5);
        tsf.printSum(new int[]{1, 2, 3, 4, 5});
        tsf.fact(6);
    }
    private void multiplicationTable(int n){
        for(int i=1, j = 11; i<=10 ; i++, j=j+1){
            System.out.println(n + " * " + i + " = " + n * i + "\t" + n + " * " + j + " = " + n * j );
        }
    }

    private void printSum(int[] arr){
        for(int sum= 0, i=0; i<arr.length; i++){
            sum += arr[i];
            if(i==arr.length-1){
                System.out.println("\nSum = " + sum);
            }
        }
    }

    private void fact(int num){
        int fact = 1;
        for(int i=1; i<=num ; i++){
            fact *= i;
        }
        if(fact==0) fact = 1;
        System.out.println("Factorial of "+ num + " is " + fact);

    }
}
