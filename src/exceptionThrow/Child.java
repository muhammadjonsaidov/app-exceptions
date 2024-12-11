package exceptionThrow;

import java.sql.SQLException;

public class Child extends Parent {
    @Override
    public void bla() throws Exception {
        System.out.println("Child bla");
        throw new RuntimeException("Child bla");
    }
}
