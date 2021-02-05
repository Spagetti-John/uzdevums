package open.spagetti.john.uzdevums;

public class SimpleMethods {

    public static int add (int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int badFactorial(int a) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(a == 1) {
            return 1;
        } else {
            return a * badFactorial(a - 1);
        }
    }
}
