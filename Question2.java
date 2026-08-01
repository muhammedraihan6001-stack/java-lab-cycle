class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee Name : " + this.name);
        System.out.println("Employee Salary : " + this.salary);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahul", 35000);
    }
}
