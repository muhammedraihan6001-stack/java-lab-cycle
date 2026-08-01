import java.util.Scanner;

class StudentInfo {
    String name;
    int age;

    StudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name : " + this.name + " Age : " + this.age);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();

        StudentInfo student = new StudentInfo(name, age);
        student.display();
        sc.close();
    }
}
