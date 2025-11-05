package Calc;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExpressionParser {

    private static final Map<String, Integer> PRECEDENCE = new HashMap<>();

    static {
        PRECEDENCE.put("+", 1);
        PRECEDENCE.put("-", 1);
        PRECEDENCE.put("×", 2);
        PRECEDENCE.put("÷", 2);
    }

    private static boolean hasLowerOrEqualPrecedence(String op1, String op2) {
        if (!PRECEDENCE.containsKey(op1) || !PRECEDENCE.containsKey(op2)) {
            return false;
        }
        return PRECEDENCE.get(op1) <= PRECEDENCE.get(op2);
    }

    private static void applyOperator(Stack<Operation> values, Stack<String> ops) {
        String op = ops.pop();

        if (values.empty()) {
            throw new IllegalArgumentException("Missing operand for operator: " + op);
        }
        Operation right = values.pop();

        if (values.empty()) {
            throw new IllegalArgumentException("Missing operand for operator: " + op);
        }
        Operation left = values.pop();

        Operation result = OperationFactory.getOperation(op, left, right);

        if (result == null) {
            throw new IllegalArgumentException("Unsupported operator: " + op);
        }

        values.push(result);
    }

    public static Operation parse(String expression) {
        String expr = expression.replaceAll("\\s+", " ").trim();
        if (expr.isEmpty()) {
            throw new IllegalArgumentException("Empty expression");
        }

        String[] tokens = expr.split(" ");

        Stack<String> ops = new Stack<>();
        Stack<Operation> values = new Stack<>();

        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            }

            if (PRECEDENCE.containsKey(token)) {
                String currentOp = token;

                while (!ops.empty() && hasLowerOrEqualPrecedence(currentOp, ops.peek())) {
                    applyOperator(values, ops);
                }

                ops.push(currentOp);

            } else {
                try {
                    float value = Float.parseFloat(token);
                    values.push(new NumberExpression(value));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid number in expression: " + token);
                }
            }
        }

        while (!ops.empty()) {
            applyOperator(values, ops);
        }

        if (values.size() != 1) {
            throw new IllegalArgumentException("Invalid expression format.");
        }

        return values.pop();
    }
}
