package Calc;

/**
 * Facade Pattern
 * Provides a simple interface for performing calculations.
 */
public class CalculatorFacade {

    private Calculator calculator;

    public CalculatorFacade() {
        calculator = Calculator.getInstance(); // Uses Singleton
    }

    public void showCalculator() {
        calculator.setVisible(true);
    }

    public float performOperation(String operation, float a, float b) {
        Operation op = OperationFactory.getOperation(operation);
        if (op == null) {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }
        return op.execute(a, b);
    }

    public void clearCalculator() {
        calculator.clear();
    }
}
