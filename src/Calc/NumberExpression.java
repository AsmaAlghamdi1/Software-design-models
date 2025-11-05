
package Calc;

// Leaf Node: Represents a simple numeric value (operand)

public class NumberExpression implements Operation {
    
    private final float value;

    public NumberExpression(float value) {
        this.value = value;
    }

    // The execute method simply returns its internal value. 
    // It ignores the passed parameters (a, b) from the interface.
    @Override
    public float execute(float a, float b) {
        return this.value;
    }
}
