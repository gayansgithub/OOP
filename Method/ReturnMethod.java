class Calculator {
    // instance method to add numbers
    int add(int a, int b) {
        return a + b;
    }

    // instance method to multiply numbers
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(); // create object

        int sum = calc.add(8, 5);          // calling instance method
        int product = calc.multiply(4, 6); // calling instance method

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
