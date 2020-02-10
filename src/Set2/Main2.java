package Set2;

public class Main2 {

    public static void main(String args[]) {
        Base1 b = new Base1();
        System.out.println("x = " + b.x + ", y = " + b.y);
    }
}

class Base1{
    protected int x, y;
    public Base1(){}
    public Base1(int _x, int _y) {
        x = _x;
        y = _y;
    }
}
