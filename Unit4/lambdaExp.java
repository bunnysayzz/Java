// This is a Java program that demonstrates the use of lambda expressions to create a functional interface for a simple calculator.

public class lambdaExp {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        int result = calculator.calculate(5, 3);
        System.out.println(result);
    }
    
    interface Calculator {
        int calculate(int a, int b);
    }
}