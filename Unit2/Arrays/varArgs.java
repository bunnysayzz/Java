public class varArgs {
    public static void main(String[] args){
        add();
        add(10);
        add(2,3,4);

    }
    public static void add(int... numbers){
        int sum = 0;
        for (int num : numbers){
        sum = sum + num;

        }
        System.out.println(sum);
    }
}