
package Calc;

public class DivOperation implements Operation {
    private final Operation left;
    private final Operation right;

    public DivOperation(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public float execute (float a, float b) {
        float valA = left.execute(0, 0);
        float valB = right.execute(0, 0);
        
        if (valB == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return valA / valB;
    }
}