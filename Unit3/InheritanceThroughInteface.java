class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child method");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.parentMethod(); // Output: Parent method
        obj.childMethod();  // Output: Child method
    }
}
