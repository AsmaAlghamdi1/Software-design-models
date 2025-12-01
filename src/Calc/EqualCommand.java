
package Calc;


public class EqualCommand implements Command {

    private Calculator calculator;
    private String previousExpression;
    private String previousResult;

    public EqualCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        previousExpression = calculator.getCurrentExpression();
        calculator.compute();
        previousResult = calculator.getCurrentExpression();
        calculator.pushHistory(this);
    }

    @Override
    public void undo() {
        calculator.setCurrentExpression(previousExpression);
    }
}
