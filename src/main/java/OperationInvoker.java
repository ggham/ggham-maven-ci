import java.util.ArrayList;
import java.util.List;

/**
 * Created by giorgi on 5/7/2016.
 */
public class OperationInvoker {
    private Operation _operation;
    private List<Integer> _operands;

    public OperationInvoker(Operation operation){
        _operation = operation;
        _operands = new ArrayList<Integer>();
    }

    public void addOperand(int operand){
        _operands.add(operand);
    }

    public int invokeOnAllOperands(){
        int result = 0;
        for (Integer operand : _operands) {
            result = _operation.invokeOperation(result, operand);
        }

        return result;
    }
}
