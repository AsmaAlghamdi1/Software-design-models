
package Calc;

public class OperatorCommand extends StatefulCommand {

    private String operator;

    public OperatorCommand(Calculator calculator, String operator) {
        super(calculator);
        this.operator = operator;
    }

    @Override
    protected void doExecute() {
        calculator.chooseOperation(operator);
    }
}
