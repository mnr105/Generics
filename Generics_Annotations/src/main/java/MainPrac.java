import Practice.Exercitii;
import Practice.Exercitii2;
import Practice.Pair;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by lluca on 01-Nov-16.
 */
public class MainPrac {

    public static void main(String[] args) {
      /*  List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);
        //System.out.println(s);

        Exercitii ex = new Exercitii();
        // Create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        ex.printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        ex.printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        ex.printArray(charArray);   // pass a Character array

        Exercitii2<Integer> integerBox = new Exercitii2<Integer>();
        Exercitii2<String> stringBox = new Exercitii2<String>();

        integerBox.addT(new Integer(10));
        stringBox.addT(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.getT());
        System.out.printf("String Value :%s\n", stringBox.getT());*/


        Pair<String, Integer> p1 = new Pair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new Pair<String, String>("Hello", "World");

        System.out.println(p1.getKey());
        System.out.println(p1.getValue());

    }

}
