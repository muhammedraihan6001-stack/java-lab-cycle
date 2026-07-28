// Concrete subclass for certificate course evaluation.
class CertificateCourseEvaluation extends StudentEvaluation {
    public CertificateCourseEvaluation(String studentName, String courseName, int internalMarks, int externalMarks) {
        super(studentName, courseName, internalMarks, externalMarks);
    }

    @Override
    public int calculateTotalMarks() {
        return internalMarks + externalMarks;
    }

    @Override
    public void displayGrade() {
        int total = calculateTotalMarks();
        if (total >= 70) {
            System.out.println("Grade: A");
        } else if (total >= 50) {
            System.out.println("Grade: B");
        } else if (total >= 35) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
