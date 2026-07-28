// Concrete subclass for undergraduate evaluation.
class UGCourseEvaluation extends StudentEvaluation {
    public UGCourseEvaluation(String studentName, String courseName, int internalMarks, int externalMarks) {
        super(studentName, courseName, internalMarks, externalMarks);
    }

    @Override
    public int calculateTotalMarks() {
        return internalMarks + externalMarks;
    }

    @Override
    public void displayGrade() {
        int total = calculateTotalMarks();
        if (total >= 80) {
            System.out.println("Grade: A");
        } else if (total >= 60) {
            System.out.println("Grade: B");
        } else if (total >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
