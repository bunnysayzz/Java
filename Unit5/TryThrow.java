public class TryThrow {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        
        for (int i = 0; i < 5; i++) {
            b = i;
            try {
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                c = a / b;
                System.out.println("c = " + c);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}