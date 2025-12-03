
package Calc;

public class UndoCommand implements Command {

    private Calculator calculator;

    public UndoCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        calculator.undoLast();  
    }

    @Override
    public void undo() {
        // Undo of Undo not needed
    }
}