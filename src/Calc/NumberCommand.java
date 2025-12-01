
package Calc;

public class NumberCommand implements Command {

    private Calculator calculator;
    private String number;
    private String previousExpression;

    public NumberCommand(Calculator calculator, String number) {
        this.calculator = calculator;
        this.number = number;
    }

    @Override
    public void execute() {
        previousExpression = calculator.getCurrentExpression();
        calculator.appendNumber(number);
        calculator.pushHistory(this);
    }

    @Override
    public void undo() {
        calculator.setCurrentExpression(previousExpression);
    }
}
