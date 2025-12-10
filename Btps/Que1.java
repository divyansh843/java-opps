package Opps.Btps;
class Student {
    int id;
    String name;
    float marks;

    // Constructor
    Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to print student details
    void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}


public class Que1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Divyansh", 92.5f);

        s1.printDetails();
    }
    
}
