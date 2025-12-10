package Opps.Interface;

interface printable {
    void print();

}

interface showable{
    void show();
}

class Demo {
    void print(){
        System.out.println("interface 1 method");
    }

    void show(){
        System.out.println("interface 2 method");
    }

}

public class program2 {

    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        d.show();
        
    }
    
}
