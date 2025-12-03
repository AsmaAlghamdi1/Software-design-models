
package Calc;

public class OperatorCommand implements Command {

    private Calculator calculator;
    private String operator;

    private CalculatorMemento before;
    private CalculatorMemento after;

    public OperatorCommand(Calculator calculator, String operator) {
        this.calculator = calculator;
        this.operator = operator;
    }

    @Override
    public void execute() {
        before = calculator.saveState();
        calculator.chooseOperation(operator);
        after = calculator.saveState();
        calculator.pushHistory(this);
    }

    @Override
    public void undo() {
        calculator.restoreState(before);
    }

    public void redo() {
        calculator.restoreState(after);
    }
}
