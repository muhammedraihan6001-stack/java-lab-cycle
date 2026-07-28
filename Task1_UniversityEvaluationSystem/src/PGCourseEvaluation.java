// Concrete subclass for postgraduate evaluation.
class PGCourseEvaluation extends StudentEvaluation {
    public PGCourseEvaluation(String studentName, String courseName, int internalMarks, int externalMarks) {
        super(studentName, courseName, internalMarks, externalMarks);
    }

    @Override
    public int calculateTotalMarks() {
        return (int) (internalMarks * 0.4 + externalMarks * 0.6);
    }

    @Override
    public void displayGrade() {
        int total = calculateTotalMarks();
        if (total >= 75) {
            System.out.println("Grade: A");
        } else if (total >= 60) {
            System.out.println("Grade: B");
        } else if (total >= 45) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
