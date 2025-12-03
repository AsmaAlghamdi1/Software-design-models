package Calc;

public interface Command {

    void execute();
    void undo();
    void redo();
}
