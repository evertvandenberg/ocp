package nl.ing.ocp.generics.Pair;

import nl.ing.ocp.generics.GenericBox.Box;

/**
 * Created by vdBerg on 2/16/17.
 */
public class Runner {
    public static void main(String [] args){

        OrderedPair<String, Integer> orderedPair = new OrderedPair<String, Integer>(new String("Test"), new Integer(5));

        System.out.format("waarde %s,  %d\n", orderedPair.getKey(), orderedPair.getValue());


        OrderedPair<Box<String>, Integer> orderedPair1 = new OrderedPair<Box<String>, Integer>(new Box<String>("test"), 5);
        System.out.format("waarde %s,  %d\n", orderedPair1.getKey().toString(),  orderedPair1.getValue());



        OrderedPair<String, Integer> orderedPair2 = new OrderedPair<String, Integer>("hoi", 2);
        OrderedPair<String, Integer> orderedPair3 = new OrderedPair<String, Integer>("hoi", 1);

        System.out.println(Util.compare(orderedPair2, orderedPair3));




    }
}
