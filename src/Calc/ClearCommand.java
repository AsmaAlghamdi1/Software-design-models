
package Calc;

public class ClearCommand extends StatefulCommand {

    public ClearCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    protected void doExecute() {
        calculator.clear();
    }
}
