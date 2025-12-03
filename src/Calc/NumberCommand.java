
package Calc;

public class NumberCommand extends StatefulCommand {

    private String number;

    public NumberCommand(Calculator calculator, String number) {
        super(calculator);
        this.number = number;
    }

    @Override
    protected void doExecute() {
        calculator.appendNumber(number);
    }
}
