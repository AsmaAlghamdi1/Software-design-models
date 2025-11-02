package Calc;

/**
 *
 * @author youcefhmd
 */

/**
 * Applied Design Patterns:
 * 1) Singleton: to ensures only one Calculator instance exists.
 * 2) Factory Method: to creates operation objects (+, -, ×, ÷) instead of using switch.
 * 3) Facade: provides a simple interface to the calculator system.
 * 
 * names:
 * Asma Alghamdi
 * Ebtehal Alzahrani
 * Jood Bahkli
 */

public class App {

    public static void main(String[] args) {
        CalculatorFacade facade = new CalculatorFacade();
        facade.showCalculator();  // Opens the calculator GUI through Facade
    }
}
