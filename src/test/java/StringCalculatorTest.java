import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest
{
    @Test
    public void stringEmpty() {
        Assert.assertEquals(StringCalculator.empty(""),0);
    }

    @Test
    public void stringSingleValue() {
        Assert.assertEquals(StringCalculator.empty("5"),5);
        Assert.assertEquals(StringCalculator.empty("24"),24);
    }

    @Test
    public void stringTwovalues() {
        Assert.assertEquals(StringCalculator.empty("5,2"),7);
    }
}
