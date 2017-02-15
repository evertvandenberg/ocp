package nl.ing.ocp.generics;

/**
 * Created by vdBerg on 2/12/17.
 */
public class Dog implements Animal {

private String name;

    public Dog(String name){
        this.name= name;
    }

    public String sound() {
        return "Barks";
    }


    public String name() {
        return this.name;
    }
    public int numberOfFeed() {
        return 4;
    }

    @Override
    public int hashCode(){
        System.out.println("getting hashocde from dog");
        return 1;
    };


    public int compareTo(Animal o) {
        return name.compareTo(o.name());
    }
}
