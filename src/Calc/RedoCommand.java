
package Calc;

public class RedoCommand implements Command {

    private Calculator calculator;

    public RedoCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        calculator.redoLast();
    }

    @Override
    public void undo() {}
    
    @Override
    public void redo() {}
}

