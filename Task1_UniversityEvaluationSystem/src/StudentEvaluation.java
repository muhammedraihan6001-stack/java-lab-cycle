// Abstract class representing a common evaluation model for students.
abstract class StudentEvaluation {
    protected String studentName;
    protected String courseName;
    protected int internalMarks;
    protected int externalMarks;

    public StudentEvaluation(String studentName, String courseName, int internalMarks, int externalMarks) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }

    public void displayStudentDetails() {
        System.out.println("Student: " + studentName);
        System.out.println("Course: " + courseName);
        System.out.println("Internal Marks: " + internalMarks);
        System.out.println("External Marks: " + externalMarks);
    }

    public abstract int calculateTotalMarks();
    public abstract void displayGrade();
}
