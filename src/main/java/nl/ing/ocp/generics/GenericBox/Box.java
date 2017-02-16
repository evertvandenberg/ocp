package nl.ing.ocp.generics.GenericBox;

/**
 * Created by vdBerg on 2/16/17.
 */
public class Box<T> {

    public Box(T t) {
        this.t = t;
    }

    public Box(){};

    private T t;
    public void set(T t){
        this.t = t;
    }


    public T get(){
        return this.t;
    }

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }
}
