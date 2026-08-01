class StudentChain {
    String name;
    int age;

    StudentChain() {
        this("Manu", 21);
        System.out.println("Default Constructor");
    }

    StudentChain(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Name : " + this.name + " Age : " + this.age);
    }
}

public class Question5 {
    public static void main(String[] args) {
        StudentChain student = new StudentChain();
    }
}
