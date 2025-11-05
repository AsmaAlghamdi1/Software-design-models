
package Calc;


import java.util.ArrayList;
import java.util.List;

public class HistoryDecorator extends OperationDecorator {

    private static final List<String> history = new ArrayList<>();

    private final String expression;

    public HistoryDecorator(Operation decoratedOperation, String expression) {
        super(decoratedOperation);
        this.expression = expression;
    }

    @Override
    public float execute(float a, float b) {
        float result = super.execute(a, b);

        String normalizedExpression = expression
        .replace("×", "*")
        .replace("÷", "/");

         String entry = normalizedExpression + " = " + result;
        history.add(entry);

        return result;
    }

    public static List<String> getHistory() {
        return new ArrayList<>(history);
    }
}
