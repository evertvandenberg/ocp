import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Evert on 8-2-2017.
 */
public class Main {

    public static void main(String [] args){
//        System.out.println("hoi");

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("hoi");
        linkedList.add("hoi");

        System.out.println(linkedList.contains("hoi"));
        for (String value : linkedList){
            System.out.println(value);
        }


        List<String> list = new ArrayList<String>();
        list.add("list1");
        list.add("list1");

        System.out.println(list.contains("list1"));


        //Wildcard

        Integer myInt = 5;

        List<? extends Number> myList = new ArrayList<String>();

        Number number = 5;

        myList.add(number);



    }
}
