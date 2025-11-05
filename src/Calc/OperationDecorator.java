/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author Dell
 */
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