// class 
class Student {
    String name;   // property
    int age;

    void study() {   // behavior
        System.out.println(name + " is studying.");
    }
}


public class classes{
    
    public static void main (String[] args){
        // create an object of Student class
        Student student1 = new Student();
        student1.name = "Divyaansh";
        student1.age = 20;
        student1.study();
    }
}