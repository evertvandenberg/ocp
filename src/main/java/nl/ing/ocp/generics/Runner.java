package nl.ing.ocp.generics;

import java.util.*;

/**
 * Created by vdBerg on 2/12/17.
 */
public class Runner {


    public static void main(String [] args){
        List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Cat("Tijger"));
        animals.add(new Cat("Pip"));
        animals.add(new Dog("geen"));


        for (Animal animal : animals){
            System.out.println("This animal " + animal.name() + " " + animal.sound());
        }


        List<Cat> cats = new ArrayList<Cat>();
        cats.add (new Cat("Tijger"));
        cats.add (new Cat("Pip"));

        Collections.sort(cats);
        Collections.sort(animals);

        for (Cat cat : cats){
            System.out.println("catname: " + cat.name());
        }



        System.out.println("======================");


        for (Animal animal : animals){
            System.out.println("catname: " + animal.name());
        }

        Animal an1 = animals.get(0);
        Animal an2 = animals.get(1);

        if (an1.equals(an2)){
            System.out.println("equal" );
        }


//        ===================

//        Map x  = new HashMap(Animal);
//        x.p

    }
}
