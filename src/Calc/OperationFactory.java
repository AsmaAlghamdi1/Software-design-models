
package Calc;

public class OperationFactory {
    public static Operation getOperation(String operator) {
        return switch (operator) {
            case "+" -> new AddOperation();
            case "-" -> new SubOperation();
            case "×" -> new MultOperation();
            case "÷" -> new DivOperation();
            default -> null;
        };
    }
}
