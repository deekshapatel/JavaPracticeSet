package Set2;

public class Main {

    public static void m2(Base base){
        base.m1();
    }

    public static void main(String[] args){
        Base b=new Base();
        Base ad=new Drived();
        Drived d=new Drived();
        b.m1();
        ad.m1();
        d.m1();

    }
}

class Base{
    public void m1(){
        System.out.println("Base Class");
    }
}

class Drived extends Base{
    public void m1(){
        System.out.println("Drived Class");
    }
}