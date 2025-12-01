package Calc;

/**
 *
 * @author youcefhmd
 */

/**
 * Applied Design Patterns:
 * 1) Singleton: to ensures only one Calculator instance exists.
 * 2) Factory Method: to creates operation objects (+, -, ×, ÷) instead of using switch.
 * 3) Composite Pattern: Allows complex arithmetic expressions (e.g., 5 + 3 - 2) 
 * to be treated uniformly as a single object (Expression Tree).
 * 4) Decorator Pattern: Adds new responsibilities dynamically (like history logging 
 * and auto-clearing the display) to the core Operation objects without modifying their class structure.
 * 
 * names:
 * Asma Alghamdi
 * Ebtehal Alzahrani
 * Jood Bahkli
 */

public class App {

    public static void main(String[] args) {
        Calculator calc1 = Calculator.getInstance();
        calc1.setVisible(true);
    }
}
