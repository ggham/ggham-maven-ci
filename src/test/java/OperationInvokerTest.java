/**
 * Created by giorgi on 5/7/2016.
 */
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class OperationInvokerTest {
    @Mock XOROperation _xorOperation;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        when(_xorOperation.invokeOperation(anyInt(), anyInt()))
                .thenReturn(0);
    }

    @Test
    public void testInvokeOnTwoOperands(){
        int firstOperand = 3;
        int secondOperand = 5;
        OperationInvoker invoker = new OperationInvoker(_xorOperation);
        invoker.addOperand(firstOperand);
        invoker.addOperand(secondOperand);
        invoker.invokeOnAllOperands();

        verify(_xorOperation).invokeOperation(0, firstOperand);
        verify(_xorOperation).invokeOperation(0, secondOperand);
    }
}
