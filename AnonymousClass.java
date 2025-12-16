
interface I1 {
    void m1();
}
public class AnonymousClass {
    // I1 i = new I1() {
    //         public void m1() {
    //             System.out.println("Hello from Anonymous Class");
    //         }
    //     };

    public static void main(String[] args) {
        I1 i = new I1() {
            public void m1() {
                System.out.println("Hello from Anonymous Class");
            }
        };
        i.m1();
        // AnonymousClass obj = new AnonymousClass();
        // obj.i.m1();
        
    }
    
}
