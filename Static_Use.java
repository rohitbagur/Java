import java.util.Scanner;

class Students  {

    static int studcount = 0;
    
    private int StudAge;
    private String StudName;

    public Students(String StudName, int StudAge) {
        this.StudAge = StudAge;
        this.StudName = StudName;
    }

    public void disp() {
        System.out.println("Student " + StudName + " is age " +StudAge);
        studcount++;
    }

    public static void showStudents() {
        System.out.println("Total number of Students: " + studcount);
    }


}

public class Static_Use{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name for Student 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Age for Student 1: ");
        int age1 = sc.nextInt();
        sc.nextLine(); //buffer

        Students s1 = new Students(name1, age1);

  
        System.out.print("Enter Name for Student 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Age for Student 2: ");
        int age2 = sc.nextInt();
        sc.nextLine(); //buffer


        Students s2 = new Students(name2, age2);

        s1.disp();
        s2.disp();
        Students.showStudents();

        sc.close();
    }
}