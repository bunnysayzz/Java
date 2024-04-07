// Define an interface
interface Animal {
    void makeSound();
}

// Implement the interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.makeSound(); // Output: Woof!
        cat.makeSound(); // Output: Meow!
    }
}
