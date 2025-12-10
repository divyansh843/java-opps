package Opps.Interface;

interface a {
    default void show() {
        System.out.println("Default method");
    }

    static void m1(){
        System.out.println("m1-method by interface");
    }


    void display();
}

class b implements a{

    public void display(){
        System.out.println("class b method");
    }

}

public class class1 {

    public static void main(String[] args) {

        b c = new b();
        c.show();
        c.display();
        a.m1();
    }
    
}
