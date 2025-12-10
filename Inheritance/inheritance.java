package Opps.Inheritance;

class G {
    void m1(){
        System.out.println("m1-g");
    }
    
}

class P extends G {
    void m2(){
        System.out.println("m2-p");
    }

    void m3(){
        System.out.println("m3-p");
    }

    
}

class C extends P{

}
public class inheritance {

    public static void main(String[] args){
        C c = new C();
        c.m1();
        c.m2();
        c.m3();

    }
    
}
