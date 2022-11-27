package functional;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Lambda expressions are similar to methods but they do 
 * not need a name and they can be implemented right in the body of a method
 * syntax : parameter -> expression
 *        : (parameter1, parameter2) -> expression
*        :(parameter1, parameter2) ->{code block}
 */

public class Lambda { 
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {System.out.println(n);});
            System.out.println("##################");
            //consumer
            Consumer<Integer> method = (n) -> {System.out.println(n);};
            numbers.forEach(method);
    }
}
