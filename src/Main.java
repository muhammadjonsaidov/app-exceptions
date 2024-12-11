public class Main {
    public static void main(String[] args) {


    }

    private static void exception() {
        try {
            // Code that may throw an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }catch (RuntimeException e) {
            // Code to handle the exception
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }catch (Exception e) {
            // Code to handle the exception
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }

    private static void exceptionWithFinally() {
        try {
            // Code that may throw an exception
            int[] result = {1, 2, 3};
            result[4] = 4;
            System.out.println(result[4]);
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            // Code that will always be executed
            System.out.println("This is the finally block.");
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
    }

}
