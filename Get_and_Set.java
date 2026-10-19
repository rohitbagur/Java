import java.util.Scanner;

class Important {
    
    private int money;

    
    public void setMoney(int money) {
        if (money < 0) {
            System.out.println("Invalid amount. Setting to 0.");
            this.money = 0;
        } else {
            this.money = money;
        }
    }

    
    public int getMoney() {
        return this.money;
    }
}

public class Get_and_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter money: ");
        int available = sc.nextInt(); 

        Important imp = new Important();

        imp.setMoney(available);

    
        System.out.println("The value of money available is: " + imp.getMoney());

        sc.close();
    }
}