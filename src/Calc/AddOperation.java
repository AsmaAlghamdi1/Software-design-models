
package Calc;

public class AddOperation implements Operation {
    
    private final Operation left;
    private final Operation right;

    // Constructor Accepts two Operation objects
    public AddOperation(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public float execute(float a, float b) {
         //We pass dummy parameters (0, 0) to satisfy the interface.

        // Recursively execute the left sub-expression
        float valA = left.execute(0, 0); 
        
        // Recursively execute the right sub-expression
        float valB = right.execute(0, 0);
        
        // Perform the addition on the results
        return valA + valB;
    }
}
