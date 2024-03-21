public class Wrapper{
    public static void main(String[] args){
        int num = 4;
        // Integer num1 = new Integer(num); //boxing
        Integer num1 = num;
        System.out.println(num1); //autoboxing

        // int num2 = num1.intValue(); //un-boxing
         int num2 = num1; //auto-unboxing
        System.out.println(num2);

        String str = "13";
        int num3 = Integer.parseInt(str);
        //converting string into number 
        System.out.println(num3);
 
    }
}