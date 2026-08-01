import java.util.Scanner;

class StudentObject {
    String name;
    int mark;

    StudentObject(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class Question12 {
    static StudentObject getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Mark: ");
        int mark = sc.nextInt();
        return new StudentObject(name, mark);
    }

    public static void main(String[] args) {
        StudentObject student = getStudent();
        System.out.println("Student Name : " + student.name + " Mark : " + student.mark);
    }
}
