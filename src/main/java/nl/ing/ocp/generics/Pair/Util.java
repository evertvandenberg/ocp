package nl.ing.ocp.generics.Pair;

/**
 * Created by vdBerg on 2/16/17.
 */
public class Util {

    //Todo
    //onderstaande staat beschreven op: https://docs.oracle.com/javase/tutorial/java/generics/methods.html
    //snap niet helemaal waarom <K, V> voor de boolean moet

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}