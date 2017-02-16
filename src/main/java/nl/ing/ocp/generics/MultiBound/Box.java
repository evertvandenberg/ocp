package nl.ing.ocp.generics.MultiBound;

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

    public <U extends AbstractClassC & CInterface> void inspect (U u){

    }

    public static void main(String [] args){

        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));

        Box<BClassImpl> bBoxImpl = new Box<BClassImpl>();
//        integerBox.inspect(bBoxImpl);     // dit werkt dus niet


//        Box<ClassCImpl> classCBox = new Box<ClassCImpl>();
        ClassCImpl classC = new ClassCImpl();
        bBoxImpl.inspect(classC);       //betreffende klasse moet dus van AbstractClassC extenden en CInterface implementeren


    }
}
