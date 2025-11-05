
package Calc;


public abstract class OperationDecorator implements Operation {

    protected Operation decoratedOperation;

    public OperationDecorator(Operation decoratedOperation) {
        this.decoratedOperation = decoratedOperation;
    }

    @Override
    public float execute(float a, float b) {
        return decoratedOperation.execute(a, b);
    }
}