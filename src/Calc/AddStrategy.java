/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author Asma
 */
public class AddStrategy implements OperationStrategy {

    @Override
    public float execute(float a, float b) {
       return a+b;
    }
}
