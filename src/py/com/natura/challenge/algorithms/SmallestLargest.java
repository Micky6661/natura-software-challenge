package py.com.natura.challenge.algorithms;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 27/07/19
 */
public class SmallestLargest {

    private int smallest = 0;
    private int largest = 0;

    public SmallestLargest(int[] array) {
        if (array.length > 0) {
            this.smallest = array[0];
            for (int num : array) {
                if (num > this.largest) this.largest = num;
                if (num < this.smallest) this.smallest = num;
            }
        }
    }

    public int getSmallest() {
        return smallest;
    }

    public int getLargest() {
        return largest;
    }
}
