class Student {
    String name;
    int age;
    
    // No-Argument Constructor (User-Defined)
    Student() {
        name = "Unknown";
        age = 18;
        System.out.println("Object Created");
    }
<<<<<<< HEAD
=======

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
>>>>>>> 0aeca3d663c7cf47a848943a18c2095b1b863d89
}


public class constructers {

    public static void main(String[] args) {
        // create an object of Student class using no-argument constructor
        Student student1 = new Student();
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
<<<<<<< HEAD
=======

        // create an object of Student class using parameterized constructor
        Student s1 = new Student("Divyansh", 20);
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        // create an object of Student class using copy constructor
        Student s2 = new Student(s1);  // copy constructor
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);


>>>>>>> 0aeca3d663c7cf47a848943a18c2095b1b863d89
        
    }
    
}
