class ObjectDemo {
    ObjectDemo() {
        System.out.println("Object Created");
    }

    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
        super.finalize();
    }
}

public class Question6 {
    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo();
        ObjectDemo obj2 = new ObjectDemo();
        System.out.println("Garbage Collection Requested");
        System.gc();
    }
}
