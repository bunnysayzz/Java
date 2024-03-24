public class Bitwise{
    public static void main(String[] args){
        // AND operator means if both 1 than will be 1 otherwise 0
        //OR operator means if any 1 than 1 else 0
        int a = 10;   // 01010
        int b = 23;   // 10111
        int c = a & b;// 00010 = 2
        int d = a | b;// 11111 = 32
        //output c = 2 = 00010
        System.out.println(c);
        System.out.println(d);

    }
}