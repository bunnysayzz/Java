import java.util.ArrayList;
import java.util.Collections;


public class ArrayList2{
    public static void main(String[] args){
        //in arraylist we cant use int or any primitive becoz arraylist only suppport obkject so we need class for int and so on
        // Integer | Float | String | Boolean


        // ArrayList<type> list = new ArrayList<type>();
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(2);
        intList.add(4);
        intList.add(5);
        System.out.println(intList);

        //get element 

        System.out.println(intList.get(0));

        //add elemrnt
        // list.add(index, element);
        intList.add(1, 1);
        System.out.println(intList);

        //set element
        intList.set(0,3);
        System.out.println(intList);

        //delete element
        intList.remove(2);
        System.out.println(intList);

        //sorting
        
        Collections.sort(intList);
        System.out.println(intList);





    }
}