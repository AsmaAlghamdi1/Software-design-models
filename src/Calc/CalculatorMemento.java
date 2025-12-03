
package Calc;

public class CalculatorMemento {
    private final String expression;
    private final String lastInputType;
    private final boolean clearOnNextInput;

    public CalculatorMemento(String expression, String lastInputType, boolean clearOnNextInput) {
        this.expression = expression;
        this.lastInputType = lastInputType;
        this.clearOnNextInput = clearOnNextInput;
    }

    public String getExpression() {
        return expression;
    }

    public String getLastInputType() {
        return lastInputType;
    }

    public boolean getClearOnNextInput() {
        return clearOnNextInput;
    }
}
