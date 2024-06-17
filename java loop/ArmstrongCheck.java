import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int num = input.nextInt();
        int check = 0, digitCount= 0, temp = num;
        while(temp>0){
            temp /= 10;
            digitCount++;
        }
        for(int i=num; i!=0; i/=10){
            int digit = i%10;
            check += (int) Math.pow(digit, digitCount);
            System.out.println(check);
        }
        if(num==check){
            System.out.println("Armstrong!");
        }else{
            System.out.println("Not an Armstrong");
        }
    }
}
