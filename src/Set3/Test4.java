package Set3;

public class Test4 {

     static int x = 2;
     int y=3;

    Test4(){}
    Test4(int i) {
        x = i;
    }

    public static void main(String[] args) {
            Test4 t = new Test4();
            System.out.println("x = " + t.x);

            Test4 t1 = new Test4(5);
            System.out.println("x = " + t1.x);
    }
}
