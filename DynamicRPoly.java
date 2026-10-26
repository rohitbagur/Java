class Shape1 {
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

class Circle1 extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square1 extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class DynamicRPoly {
    public static void main(String[] args) {
        Shape ref = new Shape();

        ref = new Circle1();
        ref.draw();

        ref = new Square1();
        ref.draw();
    }
}