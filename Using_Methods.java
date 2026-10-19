class Method{

    void function(int x) {

        System.out.println("This is " + x + ", done via a function");

    }
}


public class Using_Methods{

    public static void main(String[] args) {


        System.out.println("Demonstration of calling a function: ");
        Method newobj = new Method();
        int num = 5;
        newobj.function(num);
    }
}