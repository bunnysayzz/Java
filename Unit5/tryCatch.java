public class tryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        
        for (int i = 0; i < 5; i++) {
            b = i;
            try {
                c = a / b;
                System.out.println("c = " + c);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}