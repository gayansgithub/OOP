class Student {
    String name;   // instance variable

    // instance method
    void displayInfo() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gayan";
        s1.displayInfo();   // calling instance method
    }
}
