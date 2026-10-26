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

class ColouredCircle extends Circle { //sub of sub

    void drawCircle(){
        System.out.println("Drawing a coloured Circle");
    }
}


public class MultiLvl{

    public static void main(String[] args) {

        ColouredCircle colouredobj = new ColouredCircle();
        colouredobj.draw();
        colouredobj.drawCircle();

        System.out.println("MultiLevel Inheritance Demonstrated");
    }
}