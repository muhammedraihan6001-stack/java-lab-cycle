class FinalizeDemo {
    FinalizeDemo() {
        System.out.println("Object Created");
    }

    protected void finalize() throws Throwable {
        System.out.println("finalize() method called");
        super.finalize();
    }
}

public class Question7 {
    public static void main(String[] args) {
        FinalizeDemo obj = new FinalizeDemo();
        obj = null;
        System.gc();
    }
}
