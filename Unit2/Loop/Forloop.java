import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any integer:");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}