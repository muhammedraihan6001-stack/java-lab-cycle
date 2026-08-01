import java.util.Scanner;

class StudentAccess {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentAccess student = new StudentAccess();

        System.out.print("Name: ");
        student.setName(sc.nextLine());
        System.out.print("Age: ");
        student.setAge(sc.nextInt());

        System.out.println("Student Name : " + student.getName() + " Age : " + student.getAge());
        sc.close();
    }
}
