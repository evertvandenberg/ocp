package nl.ing.ocp.generics;

/**
 * Created by vdBerg on 2/12/17.
 */
public class Cat implements Animal {
    private String name;

    public Cat(String name){
        this.name= name;
    }
    public String sound() {
        return "Miuas";
    }

    public String name() {
        return this.name;
    }

    public int numberOfFeed() {
        return 4;
    }

    @Override
    public int hashCode(){
        return 1;
    };


    public int compareTo(Animal o) {
        return name.compareTo(o.name());
    }


}
