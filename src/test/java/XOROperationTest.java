import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by giorgi on 5/7/2016.
 */


public class XOROperationTest {
    @Test
    public void testSimpleXorBetweenTwoIntegers(){
        int firstOperand = 1;
        int secondOperand = 0;
        int expectedResult = 1;

        Operation target = new XOROperation();
        assertEquals(target.invokeOperation(firstOperand, secondOperand), expectedResult);
    }
}
