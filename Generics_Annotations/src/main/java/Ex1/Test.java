package Ex1;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Collection;

/**
 * Created by lluca on 02-Nov-16.
 */
public class Test {

    public <M> boolean VerificaPalindrom(M multimea) {
        String word = multimea.toString();
        if (word.length() % 2 == 0) {
            for (int i = 0; i < (word.length() / 2); i++) {
                for (int j = ((word.length() - 1) - i); j >= (word.length() / 2); j--) {
                    //System.out.println(word.charAt(i));
                    //System.out.println(word.charAt(j));
                    if (word.charAt(i) != word.charAt(j)) {
                       // System.out.println("Am intampiat ceva inegal in par");
                        return false;
                    }
                    break;
                }
            }
        }
        if (word.length() % 2 != 0) {
            for (int i = 0; i <= ((word.length() / 2) - 1); i++) {
                for (int j = ((word.length() - 1) - i); j > ((word.length() / 2)); j--) {
                    if (word.charAt(i) != (word.charAt(j))) {
                        //System.out.println("Am intampiat ceva inegal in impar");
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }
}
