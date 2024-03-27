import java.util.Arrays;
import java.util.Scanner;

public class multiArray{
    public static void main(String[] args){
        int[][] arr = new int[3][4];
        Scanner scanner = new Scanner(System.in);
            for (int i=0; i<arr.length; i++){
                for (int j=0; j<arr[i].length; j++){
            arr[i][j] = scanner.nextInt();
        }}
        for (int i=0; i<arr.length; i++){
        System.out.println(Arrays.toString(arr[i]));
    }
}
}