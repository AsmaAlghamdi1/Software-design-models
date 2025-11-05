
package Calc;

public class MultOperation implements Operation {
    private final Operation left;
    private final Operation right;

    public MultOperation(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public float execute (float a, float b) {
        float valA = left.execute(0, 0);
        float valB = right.execute(0, 0);
        
        return valA * valB;
    }
}