public class Tern_in_Tern_Ops {

    public static void main (String[] args) {

        int a = 10, b = 30, c = 15, result;

        result = ((a > b && a > c) ? a : (b > c) ? b : c);
        System.out.println(result);
    }
    
}
