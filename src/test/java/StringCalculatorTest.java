import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest
{
    @Test
    public void stringEmpty() {
        Assert.assertEquals(StringCalculator.AddNumbers(" "),0);
    }

    @Test
    public void stringSingleValue() {
        Assert.assertEquals(StringCalculator.AddNumbers("5"),5);
        Assert.assertEquals(StringCalculator.AddNumbers("24"),24);
    }

    @Test
    public void stringTwovalues() {
        Assert.assertEquals(StringCalculator.AddNumbers("5,2"),7);
    }

    @Test
    public final void StringofMoreThanTwoValues() {
        Assert.assertEquals(StringCalculator.AddNumbers("1,2,3,4"), 10);
    }

    @Test
    public final void StringAdditionOfNumbersOnTheNewLine() {
        Assert.assertEquals(StringCalculator.AddNumbers("1\n2,3"), 6);
    }
    @Test
    public final void StringAdditionOfNumbersWithDelimeters() {
        Assert.assertEquals(StringCalculator.AddNumbers("//;\n1;2"), 3);
    }
    @Test
    public final void StringAdditionOfNegetiveValues() {
        Assert.assertEquals(StringCalculator.AddNumbers("-1,-2,3,4"), 3);
    }

    @Test
    public final void StringAdditionOfNumbersWithDelimetersGreaterThan1000() {
        Assert.assertEquals(StringCalculator.AddNumbers("//;\n1000,1;2"), 3);
    }
}
