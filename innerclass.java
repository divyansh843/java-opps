
public class innerclass {

    abstract class A {
        abstract void display();

    }

    class b extends A {
        void display() {
            System.out.println("inner class method");
        }
    }

    public static void main(String[] args) {
        
        innerclass.b c = new innerclass().new b();
        c.display();
        
    }
    
}
