package nl.ing.ocp.generics.Pair;

/**
 * Created by vdBerg on 2/16/17.
 */
public class OrderedPair<K, V> implements Pair<K, V> {

    K key;
    V value;

    public OrderedPair(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
