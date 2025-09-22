package Calc;

/**
 *
 * @author youcefhmd
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
