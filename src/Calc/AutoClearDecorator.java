
package Calc;

public class AutoClearDecorator extends OperationDecorator {

    private final Calculator calculator;

    public AutoClearDecorator(Operation decoratedOperation, Calculator calculator) {
        super(decoratedOperation);
        this.calculator = calculator;
    }

    @Override
    public float execute(float a, float b) {
        float result = super.execute(a, b);
        calculator.setClearOnNextInput(true);

        return result;
    }
}