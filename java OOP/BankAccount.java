public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount sAcc = new SavingsAccount();
        sAcc.address = "A Kingdom far far away";
        sAcc.displayInfo();
    }
}

class Account{
    public String accountNo;
    public String name;
    public String address;
    Account(){
        name = "Anon";
        accountNo = "111222333";
        address = "Somewhere only we know";
    }
    public void displayInfo(){
        System.out.println("Account No: " + accountNo);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
    }
}

class SavingsAccount extends  Account{
    private final String accountType = "Savings Account";
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Account Type = " + accountType);
    }
}
