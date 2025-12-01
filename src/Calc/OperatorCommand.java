
package Calc;

public class OperatorCommand implements Command {

    private Calculator calculator;
    private String operator;
    private String previousExpression;

    public OperatorCommand(Calculator calculator, String operator) {
        this.calculator = calculator;
        this.operator = operator;
    }

    @Override
    public void execute() {
        previousExpression = calculator.getCurrentExpression();
        calculator.chooseOperation(operator);
        calculator.pushHistory(this);
    }

    @Override
    public void undo() {
        calculator.setCurrentExpression(previousExpression);
    }
}
