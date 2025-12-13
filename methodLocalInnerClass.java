class OuterClass {
    void outerMethod() {
        class MethodLocalInnerClass {
            void display() {
                System.out.println("Inside Method Local Inner Class");
            }
        }
        
        MethodLocalInnerClass inner = new MethodLocalInnerClass();
        inner.display();
        
    }

    
}
public class methodLocalInnerClass {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
        
        
    }
    
}
