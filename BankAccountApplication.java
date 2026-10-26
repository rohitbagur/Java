class BankAccount {

    int accountNumber;
    double balance;
    //could use getters and setters but simplifying here
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
}
}
class SavingsAccount extends BankAccount {

    private double interestrate;

    public SavingsAccount(int accountNumber, double balance, double interestrate){
        super(accountNumber, balance); //or use this if no keywords

        this.interestrate = interestrate;
    }

    public void calc (){
        double interest = balance * interestrate;
        System.out.println("Interest is : " + interest);
    }
}


public class BankAccountApplication {

    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount(1, 500, 0.05);
        s1.calc();
    }
}
