import java.util.List;

/**
 * Created by lluca on 03-Nov-16.
 */
public class Ex7 {
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println("Raspuns: se compileaza");
    }
}
