public class UsingThrow {
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("not divide by zero");  
        }
        return a / b;
    }

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;  

        try {
            int result = divide(numerator, denominator);  
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception occur " + e.getMessage());
        } 
    }
}
