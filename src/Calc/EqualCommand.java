
package Calc;


public class EqualCommand implements Command {

 
    private Calculator calculator;

    private CalculatorMemento before;
    private CalculatorMemento after;

    public EqualCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        before = calculator.saveState();
        calculator.compute();
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
