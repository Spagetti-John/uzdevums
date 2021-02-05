package open.spagetti.john.uzdevums;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMethodsTest {

    @org.junit.jupiter.api.Test
    void add() {
        int a = rngNumber();
        int b = rngNumber();
        Assertions.assertEquals(a + b, SimpleMethods.add(a, b));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int a = rngNumber();
        int b = rngNumber();
        Assertions.assertEquals(a * b, SimpleMethods.multiply(a, b));
    }

    @org.junit.jupiter.api.Test
    void badFactorial() {
        int a = 10;
        Assertions.assertEquals(3628800, SimpleMethods.badFactorial(a));
    }

    int rngNumber() {
        return (int) (Math.random() * 100);
    }
}