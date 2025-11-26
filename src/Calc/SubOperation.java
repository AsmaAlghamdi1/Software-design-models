
package Calc;

public class SubOperation implements Operation {
    private final Operation left;
    private final Operation right;
    private final OperationStrategy strategy;// هذا ضفته جديد

    public SubOperation(Operation left, Operation right) {
        this.left = left;
        this.right = right;
        
        this.strategy = new SubStrategy();
    }
    
    @Override
    public float execute (float a, float b) {
        float valA = left.execute(0, 0);
        float valB = right.execute(0, 0);
        
        return strategy.execute(valA, valB);
    }
}