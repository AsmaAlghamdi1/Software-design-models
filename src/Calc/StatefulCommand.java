/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author Dell
 */
public abstract class StatefulCommand implements Command {

    protected Calculator calculator;
    protected CalculatorMemento before;
    protected CalculatorMemento after;

    public StatefulCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public final void execute() {
        
        before = calculator.saveState();
        doExecute();
        after = calculator.saveState();
        calculator.pushHistory(this);
    }

    protected abstract void doExecute();

    @Override
    public void undo() {
        calculator.restoreState(before);
    }

    @Override
    public void redo() {
        calculator.restoreState(after);
    }
}
