interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {
    public void myMethod() {
        System.out.println("Implementing method defined in MyInterface");
    }
}

public class InheritanceThroughClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod(); // Output: Implementing method defined in MyInterface
    }
}
