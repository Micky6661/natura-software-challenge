package py.com.natura.challenge.algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 26/07/19
 */
class WordsCounter {

    private Map<String, Integer> wordsCount;
    private String highestRepeated;
    private Integer repeatedQuantity;

    public WordsCounter(File file) throws FileNotFoundException {
        this.wordsCount = new HashMap<>();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String word = input.next();
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
    }

    public String getHighestRepeated() {
        int higher = 0;
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            if (entry.getValue() > higher) {
                higher = entry.getValue();
                this.highestRepeated = entry.getKey();
                this.repeatedQuantity = higher;
            }
        }
        return this.highestRepeated;
    }

    public Integer getRepeatedQuantity() {
        return repeatedQuantity;
    }
}
