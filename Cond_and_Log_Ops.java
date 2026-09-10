public class Cond_and_Log_Ops {

    public static void main(String[] args) {

        int student_attendance1 = 80;
        int student_score1 = 90;

        int student_attendance2 = 80;
        int student_score2 = 75;

        int student_attendance3 = 60;
        int student_score3 = 90;

        int student_attendance4 = 50;
        int student_score4 = 50;

        if (student_attendance1 > 70 && student_score1 > 80 ) {

            System.out.println("Student 1 Passed");
        } else {
            System.out.println("Student 1 Failed");
        }

        if (student_attendance2 > 70 && student_score2 > 80 ) {

            System.out.println("Student 2 Passed");
        } else {
            System.out.println("Student 2 Failed");
        }

        if (student_attendance3 > 70 && student_score3 > 80 ) {

            System.out.println("Student 3 Passed");
        } else {
            System.out.println("Student 3 Failed");
        }

        if (student_attendance4 > 70 && student_score4 > 80 ) {

            System.out.println("Student 4 Passed");
        } else {
            System.out.println("Student 4 Failed");
        }
        // Belive me this can be way shorter but i just did this to practice syntax 
    }
}