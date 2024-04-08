// Define Myexception class
class Myexception extends Exception {
    public Myexception(int i) {
        super("Value " + i + " is greater than 100");
    }
}

// ExceptionTest class
public class ExceptionTest {
    public void show(int i) throws Myexception {
        if (i > 100)
            throw new Myexception(i);
        else
            System.out.println(i + " is less than 100, it is ok");
    }

    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        ExceptionTest t = new ExceptionTest();
        try {
            t.show(i);
            t.show(j);
        } catch (Throwable e) {
            // Handle the exception here
        }
    }
}