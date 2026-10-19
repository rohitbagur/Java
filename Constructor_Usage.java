import java.util.Scanner;

class Constructor{

    int accountbal;

    public Constructor(int accountbal) {

        this.accountbal = accountbal;

        System.out.println("Your account balance is: " + accountbal);
    }
}


public class Constructor_Usage{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account balance: ");
        int bal = sc.nextInt();

        Constructor con = new Constructor(bal);
        
        sc.close();
        

    }
}