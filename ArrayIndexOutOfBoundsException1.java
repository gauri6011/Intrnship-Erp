public class ArrayIndexOutOfBoundsException1 {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            System.out.println("Element at index 5: " + arr[5]); 
            int result = 10 / 0;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occur");
        }
        catch (ArithmeticException e) {
            System.out.println("Exception occur");
        }
        finally {
            System.out.println("Finally block ");
        }
    }
}
