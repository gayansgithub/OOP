class MathUtils {
    // static method
    static int square(int n) {
        return n * n;
    }
}

public class Main {
    public static void main(String[] args) {
        // calling static method using class name
        int result = MathUtils.square(5);
        System.out.println("Square: " + result);
    }
}
