
package Calc;

public class ClearCommand implements Command {


    private Calculator calculator;

    private CalculatorMemento before;
    private CalculatorMemento after;

    public ClearCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        before = calculator.saveState();
        calculator.clear();
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
