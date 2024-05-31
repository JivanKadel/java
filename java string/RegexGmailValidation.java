import java.util.Scanner;

public class RegexGmailValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gmail address");
        String str = input.next();
        boolean isAGmailAddress = str.matches("\\w*@gmail[.][a-z]*");
        System.out.println(isAGmailAddress);
        String[] nameAndEmail = str.split("@");
        String name = nameAndEmail[0];
        System.out.println(name);
    }
}
