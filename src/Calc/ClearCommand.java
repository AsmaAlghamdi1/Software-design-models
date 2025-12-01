
package Calc;

public class ClearCommand implements Command {

    private Calculator calculator;
    private String previousExpression;

    public ClearCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        previousExpression = calculator.getCurrentExpression();
        calculator.clear();
        calculator.pushHistory(this);
    }

    @Override
    public void undo() {
        calculator.setCurrentExpression(previousExpression);
    }
}
