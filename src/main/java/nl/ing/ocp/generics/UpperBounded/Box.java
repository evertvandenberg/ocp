package nl.ing.ocp.generics.UpperBounded;

import nl.ing.ocp.generics.Animal;
import nl.ing.ocp.generics.Cat;
import nl.ing.ocp.generics.Dog;

/**
 * Created by vdBerg on 2/16/17.
 */
public class Box <T>{


    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }


    //Dus alle klassen die Number extenden
    // extends betekend hier: mean either "extends" (as in classes) or "implements" (as in interfaces).

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public <U extends Animal> void inspectAnimal(U u){
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));

     integerBox.inspect(new Integer(1));
        integerBox.inspect(new Long("40"));


        integerBox.inspect(new MyOwnLong("10"));
//        integerBox.inspect("some text"); // error: this is still String!

        Animal cat = new Cat("Tijger");
        Animal dog = new Dog("Woef");
        Box<Animal> animalBox = new Box<Animal>();

        animalBox.inspectAnimal(cat);
        animalBox.inspectAnimal(dog);

        Dog dog1 = new Dog("another dog");
        animalBox.inspectAnimal(dog1);

    }
}
