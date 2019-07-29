package py.com.natura.challenge.algorithms;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 26/07/19
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        /* Words Counter*/
        WordsCounter wordsCounter = new WordsCounter(new File("your/file/path/challenge.txt"));
        System.out.println("Most Repeated Word in File is: " + wordsCounter.getHighestRepeated());
        System.out.println("Repeated Quantity: " + wordsCounter.getRepeatedQuantity());

        /* Fibonacci */
        Fibonacci.fibonacciCalc(21);

        /* Smaller & Larger */
        SmallestLargest number = new SmallestLargest(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("\nThe smallest number is: " + number.getSmallest());
        System.out.println("The largest number is: " + number.getLargest());
    }

}


