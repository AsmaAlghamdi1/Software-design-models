
package Calc;


public class EqualCommand extends StatefulCommand {

    public EqualCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    protected void doExecute() {
        calculator.compute();
    }
}
