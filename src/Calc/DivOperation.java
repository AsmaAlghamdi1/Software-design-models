
package Calc;

public class DivOperation implements Operation {
    @Override
    public float execute(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
