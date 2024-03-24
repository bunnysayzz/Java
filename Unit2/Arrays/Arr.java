import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        int[] nums = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println("Elements of the array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        
    }
}
