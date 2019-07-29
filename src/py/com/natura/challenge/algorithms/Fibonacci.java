package py.com.natura.challenge.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 26/07/19
 */
public class Fibonacci {

    public static void fibonacciCalc(int limit) {

        List<Integer> memory = new ArrayList<>();
        int numberA = 0, sum;
        int numberB = numberA + 1;

        if (limit <= 0) {
            System.out.println("Limite must be higher than 0 (Zero).");
            return;
        }
        memory.add(numberA);
        while (limit >= numberB) {
            memory.add(numberB);
            sum = numberA + numberB;
            numberA = numberB;
            numberB = sum;
        }

        System.out.println("\nFibonacci Limit was: " + limit);
        System.out.println("Fibonacci Memory: " + memory);
    }
}
