class Shape { //parent

    void draw(){
        System.out.println("Drawing a Shape");
    }
}

class Circle extends Shape { //sub

    void drawCircle(){
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape { //sub of sub

    void drawSquare(){
        System.out.println("Drawing a Square");
    }
}


public class Hierarchial{

    public static void main(String[] args) {

        Circle Ci = new Circle();
        Square sq = new Square();
        sq.drawSquare();
        sq.draw();
        Ci.drawCircle();
        Ci.draw();

        System.out.println("Hierarchial Inheritance Demonstrated");
    }
}