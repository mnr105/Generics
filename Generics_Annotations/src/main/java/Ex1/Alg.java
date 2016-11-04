package Ex1;

import java.util.Collection;

/**
 * Created by lluca on 02-Nov-16.
 */
public class Alg {

    public static Test test = new Test();

    public static <T> int count(Collection<T> elemente) {
        int nr = 0;
        for (T i : elemente) {
            if (test.VerificaPalindrom(i))
                nr = nr + 1;
        }
        System.out.print("Numarul cuvintelor care sunt palindrom sunt: ");
        return nr;
    }
}
