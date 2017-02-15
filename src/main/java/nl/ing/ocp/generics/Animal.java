package nl.ing.ocp.generics;

import java.io.ObjectInput;

/**
 * Created by vdBerg on 2/12/17.
 */
public interface Animal extends Comparable<Animal> {

    public int numberOfFeed();

    public String sound();

    public String name();


    @Override
    public int hashCode();

}
