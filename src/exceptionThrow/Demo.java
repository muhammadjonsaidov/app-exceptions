package exceptionThrow;

public class Demo {
    public static void main(String[] args) {
        /*
        exception types:
         checked -> Exception => SQLException, IOException, .....
         unchecked -> RuntimeException => ArithmeticException, ArrayIndexOutOfBoundsException, ....
         Errors -> we can only control "StackoverflowError", another errors aren't control
        */

        Parent parent = new Child();
        Child child = new Child();

        parent.bla();
//        child.bla();
    }
}
