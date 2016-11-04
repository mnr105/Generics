package Ex3;

import java.util.Collections;
import java.util.List;

/**
 * Created by lluca on 03-Nov-16.
 */
public class SwitchElem {

    public <T> void schimbaVar1(List<T> inputArray) {
        Collections.swap(inputArray, 1, 3);
    }

    public <T> void schimbaVar2(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
