public class GeneralisedException {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c;
        
        try {
            // Division by zero error
            c = a / b;
            
            // ArrayIndexOutOfBoundsException error
            int[] arr = new int[3];
            int value = arr[5];
            
            // NullPointerException error
            String str = null;
            int length = str.length();
        } catch (Throwable e) {
            System.out.println("Error occurred: " + e);
        }
    }
}