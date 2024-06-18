public class PrintPatterns {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1, count=0; i<=5; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=5; i++){
            for(int j=1; j<=(5-i+1); j++){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
