interface I1 {
    void m1();
}


public class lemdaexpresion {
    
    public static void main(String[] args) {
        I1 i = () -> {
            System.out.println("Hello from Lambda Expression");
        };
        i.m1();
    }
    
}
