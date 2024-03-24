public class Switch {
    public static void main(String[] args) {
        int a = 10;
        //I cant use comparison in switch statement 
        switch (a) {
            case 10:
                System.out.println("size is so large");
                break;
            case 2:
                System.out.println("size is small");
                break;
            case 3:
                System.out.println("Large size");
                break;
            default:
                System.out.println("Unknown size");
        }
    }
}