import java.util.Arrays;
import java.util.Scanner;


public class arr1{
    // public static void main(String[] args){
        // int[] arr = {2,4,5,6};
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5; i++){
            arr[i] = scanner.nextInt();


        }
        System.out.println(Arrays.toString(arr));

        //for each loop
        for(int num : arr)
        System.out.println(num);
    // }
}