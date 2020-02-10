package Set3;

public class Mongo {
    Apple apple = new Apple(10);

    Mongo(int i) {
        //System.out.println(" Test2 " + i);
        apple = new Apple(i);
    }

    public static void main(String[] args) {
        Mongo mongo = new Mongo(5);
    }
}


class Apple {
    Apple(int x) {
        System.out.println("Constructor called " + x);
    }
}

