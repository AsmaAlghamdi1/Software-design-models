package Calc;

public class OperationFactory {
    
    // Modification: Now accepts the two sub-expressions (operands)
    public static Operation getOperation(String operator, Operation left, Operation right) {
        return switch (operator) {
            // Pass the sub-expressions to the operation constructors
            case "+" -> new AddOperation(left, right);
            case "-" -> new SubOperation(left, right); 
            case "×" -> new MultOperation(left, right);
            case "÷" -> new DivOperation(left, right);
            default -> null;
        };
    }
    
    // Keep the original method signature for single-operation compatibility 
    public static Operation getOperation(String operator) {
        return null; 
    }
}