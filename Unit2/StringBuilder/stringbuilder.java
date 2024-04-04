import java.util.*;

public class stringbuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Azhar");
        System.out.println(sb);

        sb.insert(1, 'T');
        System.out.println(sb);

        // sb.delte(start, end);
        sb.delete(1, 2);
        System.out.println(sb);

        // append is used to without creating new string
        //str = str + "h" this will create new string to heap which will take to much time
        sb.append('h');
        System.out.println(sb);

        sb.length();
    }
}