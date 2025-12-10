
package Opps.Inheritance;

class Btps{
    void m1(){
        System.out.println("t1-Btps");
    }
    
}

class Btpsknp extends Btps {

    
}

class P{
    Btps m1(){
        Btps b = new Btps();

        return b;
    }
}

class C extends P{
    Btpsknp m1(){
        Btpsknp k = new Btpsknp();

        return k;

    }
    
}
public class methodoverride {
    
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        
    }
}
