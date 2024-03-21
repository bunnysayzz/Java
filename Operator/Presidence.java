public class Presidence {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = 3;
        
        int result1 = a + b * c; // Multiplication (*) has higher precedence than Addition (+)
        int result2 = (a + b) * c; // Parentheses have the highest precedence
        int result3 = a / b % c; // Division (/) and Modulus (%) have the same precedence and associate left to right
        
        System.out.println("Result 1: " + result1); // Output: 25
        System.out.println("Result 2: " + result2); // Output: 45
        System.out.println("Result 3: " + result3); // Output: 2
    }
}