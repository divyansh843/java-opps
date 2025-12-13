interface outterInterface {
    interface InnerInterface {
        void display();
        
    }

    class C implements InnerInterface {
        public void display() {
            System.out.println("Implementation of Inner Interface method");
        }
   
    }
    
}

public class interfaceInsideInterface {
 
    public static void main(String[] args) {

        outterInterface.C c = new outterInterface.C();
        c.display();
        
    }
}
