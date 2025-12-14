class thiskeyword {
    String name;
    int age;

    thiskeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s = new Student("Divyansh", 22);
        s.display();
    }
}
