import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.add(first,second);
        Assert.assertEquals(3.0, result, 0.1);
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.subtract(first,second);
        Assert.assertEquals(-1.0, result, 0.1);
    }

    @Test
    public void multiply() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.multiply(first,second);
        Assert.assertEquals(2.0, result, 0.1);
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.divide(first,second);
        Assert.assertEquals(0.5, result, 0.1);
    }


}
