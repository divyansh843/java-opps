package Opps.Btps;

class Emp{
    static String nm = "Divyansh";
    static int id = 100;
    public static void disp(){
        System.out.println(nm);
        System.out.println(id);
    }

    
}
public class Class {

    public static void main(String[] args) {
        Emp e1 = new Emp();
        Emp.disp();
        // e1.nm = "Divyansh";
        // e1.id = 100;
        // e1.disp();
        
    }
    
}
