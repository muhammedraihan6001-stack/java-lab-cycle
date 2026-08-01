class Base {
    void display() {
        System.out.println("This is the Base class");
    }
}

class Derived extends Base {
    void show() {
        System.out.println("This is the Derived class");
    }
}

class Main {
    public static void main(String[] args) {
        Derived obj = new Derived();

        obj.display();
        obj.show();   
    }
}