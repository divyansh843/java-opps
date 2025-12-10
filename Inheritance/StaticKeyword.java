package Opps.Inheritance;

// Static Keyword => if we decleared any method as static the we can access this directly from 
//                  class name with dot (.) operator.

class Test {
    int a = 10;
    static int b;

    public void m1(){
        System.out.println("This is Non static method");

    }

    public static void m2(){
        System.out.println("This is static method");

    }
    
    
}

public class StaticKeyword {
    
    public static void main(String[] args) {

        Test m = new Test();
        Test.b = 20;
        System.out.println(m.a);
        System.out.println(Test.b);
        m.m1();
        Test.m2();
        
        
        
    }
}
