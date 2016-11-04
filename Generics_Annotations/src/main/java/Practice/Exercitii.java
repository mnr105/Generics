package Practice;

/**
 * Created by lluca on 01-Nov-16.
 */
public class Exercitii {
    // generic method printArray


    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}

