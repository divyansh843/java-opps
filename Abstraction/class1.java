package Opps.Abstraction;

abstract class a {

    void m1(){
        System.out.println("hlo divyansh");
    }

    abstract void m2();

    
}

class b extends a{
    void m2(){
        System.out.println("hlo sir");
    }
}

public class class1 {

    public static void main(String[] args) {
        a c = new b();
        c.m1();
    }
    
}
