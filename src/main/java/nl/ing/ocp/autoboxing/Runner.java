package nl.ing.ocp.autoboxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdBerg on 2/12/17.
 */
public class Runner {
    public static void main(String [] args){
        List myInts = new ArrayList();

        myInts.add(1);


        Integer i1 = 1000;  //wanneer we deze <=127 maken en i2 ook, dan komt er uit de vergelijking dat ze gelijk zijn
        Integer i2 = 1000;

        if (i1 != i2){System.out.println("different object:" + i1.hashCode() + " " + i2.hashCode());}
        if (i1.equals(i2)){System.out.println("meaningfully equal");}



        /*
        In order to save memory two instances of the following wrapper objects (created thorugh boing) will always be
        == when their primitiv values are the same:
        * Boolean
        * Byte
        * Character (from \\u000 to \\u007f (7f is 127 in decimal)
        * Short and Integer from -128 to 127
        *

            */
        Integer i3 = 127;
        Integer i4 = 127;

        if (i3 == i4 ){
            System.out.println("same values");
        }
        if (i3.equals(i4)){System.out.println("meaningfully equal");}


    }
}
