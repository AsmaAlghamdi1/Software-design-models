package Calc;

/**
 *
 * @author youcefhmd
 */

/**
 * Applied Design Patterns:
 * 1) Singleton: to ensures only one Calculator instance exists.
 * 2) Factory Method: to creates operation objects (+, -, ×, ÷) instead of using switch.
 * 
 * names:
 * Asma Alghamdi
 * Ebtehal Alzahrani
 * Jood Bahkli
 */

public class App {

    public static void main(String[] args) {
        Calculator calc1 = Calculator.getInstance();
        Calculator calc2 = Calculator.getInstance();
        calc1.setVisible(true);

        if(calc1==calc2){
            System.out.println("\n calc 1 and calc 2 are the same ");
        }
    }
}
