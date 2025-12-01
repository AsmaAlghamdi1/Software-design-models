/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author Asma
 */
public class DivStrategy implements OperationStrategy {

    @Override
    public float execute(float a, float b) {
          if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
   }
    
}
