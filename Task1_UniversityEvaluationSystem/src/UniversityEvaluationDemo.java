// Driver class for the university evaluation system.
public class UniversityEvaluationDemo {
    public static void main(String[] args) {
        StudentEvaluation[] students = new StudentEvaluation[5];

        students[0] = new UGCourseEvaluation("Ali", "Computer Science", 78, 82);
        students[1] = new UGCourseEvaluation("Sara", "Business Studies", 70, 66);
        students[2] = new PGCourseEvaluation("Mina", "Data Science", 85, 72);
        students[3] = new PGCourseEvaluation("John", "Cyber Security", 60, 68);
        students[4] = new CertificateCourseEvaluation("Ravi", "Cloud Basics", 30, 40);

        System.out.println("=== University Evaluation System ===");
        for (StudentEvaluation student : students) {
            student.displayStudentDetails();
            System.out.println("Total Marks: " + student.calculateTotalMarks());
            student.displayGrade();
            System.out.println();
        }

        // New course type added without changing the abstract class.
        StudentEvaluation newStudent = new CertificateCourseEvaluation("Nadia", "AI Essentials", 45, 38);
        System.out.println("New Course Added:");
        newStudent.displayStudentDetails();
        System.out.println("Total Marks: " + newStudent.calculateTotalMarks());
        newStudent.displayGrade();
    }
}
