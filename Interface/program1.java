package Opps.Interface;

interface Animal{

    void color();

}

class Cat implements Animal{

    public void color(){
        System.out.println("Black");

    }

}

class Dog implements Animal{
    public void color(){
        System.out.println("Gray");
    }
}

public class program1 {

    public static void main(String[] args) {
        Animal color = new Dog();
        Animal c = new Cat();
        c.color();
        color.color();
        
    }
    
}
