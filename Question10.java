import java.util.Scanner;

class StudentPass {
    String name;
    int rollNo;

    StudentPass(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class Question10 {
    static void displayStudent(StudentPass student) {
        System.out.println("Student Name : " + student.name + " Roll No : " + student.rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();

        StudentPass student = new StudentPass(name, rollNo);
        displayStudent(student);
        sc.close();
    }
}
