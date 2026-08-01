public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
        demo.run();
    }

    private void run() {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Caught an arithmetic exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Caught a general exception: " + ex.getMessage());
        } finally {
            System.out.println("Cleanup actions in finally block.");
        }

        System.out.println("Program continues after exception handling.");
    }

    private int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }
}
