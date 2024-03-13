


import java.util.HashMap;
import java.util.Map;

public class ComplexCalculator {
    private Map<String, Operation> operations;

    public ComplexCalculator() {
        this.operations = new HashMap<>();
        this.operations.put("addition", new AdditionOperation());
        this.operations.put("multiplication", new MultiplicationOperation());
        this.operations.put("division", new DivisionOperation());
    }

    public ComplexNumber calculate(String operation, ComplexNumber a, ComplexNumber b) {
        if (operations.containsKey(operation)) {
            return operations.get(operation).calculate(a, b);
        } else {
            throw new UnsupportedOperationException("Operation not supported");
        }
    }
}