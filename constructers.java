class Student {
    String name;
    int age;
    
    // No-Argument Constructor (User-Defined)
    Student() {
        name = "Unknown";
        age = 18;
        System.out.println("Object Created");
    }
}


public class constructers {

    public static void main(String[] args) {
        // create an object of Student class using no-argument constructor
        Student student1 = new Student();
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        
    }
    
}
