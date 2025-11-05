/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
import java.util.List;

public class HistoryDecorator extends OperationDecorator {

    private static final List<String> history = new ArrayList<>();

    private final String expression;

    public HistoryDecorator(Operation decoratedOperation, String expression) {
        super(decoratedOperation);
        this.expression = expression;
    }

    @Override
    public float execute(float a, float b) {
        float result = super.execute(a, b);

        String entry = expression + " = " + result;
        history.add(entry);

        return result;
    }

    public static List<String> getHistory() {
        return new ArrayList<>(history);
    }
}
