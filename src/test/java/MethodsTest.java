import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MethodsTest {
    private Methods methods = new Methods();
    @Test
    public void decimalToBinaryTest(){
        double result = methods.decimalToBinary(8);
        assertEquals(1000, result);
    }

    @Test
    public void primeNumberFalseTest(){
        boolean isPrime = methods.primeNumber(14);
        assertEquals(false, isPrime);
    }
    @Test
    public void primeNumberTest(){
        boolean isPrime = methods.primeNumber(19);
        assertEquals(true, isPrime);
    }

    @Test
    public void digitsInNumberTest(){
        int digits = methods.digitsInNumber(123456);
        assertEquals(6, digits);
    }

}
