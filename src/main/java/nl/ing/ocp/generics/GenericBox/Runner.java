package nl.ing.ocp.generics.GenericBox;

import java.util.Formatter;

/**
 * Created by vdBerg on 2/16/17.
 */
@SuppressWarnings("unchecked")
public class Runner {


    public static void main(String [] args){
        Box<String> box = new Box<String>();
        Box<Integer> myBox = new Box<Integer>();

        box.set(new String("test"));
        myBox.set(new Integer(2));

        String y = box.get();


        System.out.format("valye of y: %s and value of integer: %d \n" ,  y, myBox.get());

        y = "sukkel";

        System.out.println("valye of y: " + y);
        System.out.println("valye of box: " + box.get());




        // en je kunt nog steeds de oude methode gebruiken, dus:
        Box box1 = new Box();
        box1.set("123");

        System.out.format("Raw value of box1: %s \n" , box.get());

    }

}
