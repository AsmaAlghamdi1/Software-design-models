
package Calc;

public class NumberCommand implements Command {

    private Calculator calculator;
    private String number;

    private CalculatorMemento before;
    private CalculatorMemento after;

    public NumberCommand(Calculator calculator, String number) {
        this.calculator = calculator;
        this.number = number;
    }

    @Override
    public void execute() {
        before = calculator.saveState();
        calculator.appendNumber(number);
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
