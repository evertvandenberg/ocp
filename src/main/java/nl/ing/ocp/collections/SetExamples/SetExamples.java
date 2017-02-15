package nl.ing.ocp.collections.SetExamples;

import java.util.*;

/**
 * Created by vdBerg on 2/12/17.
 */
public class SetExamples {

    public static void main(String [] args){


        //HashSet

        Set<String> set = new HashSet<String>();

        set.add("1");
        set.add("1");  // Set can only contain unique keys, so this one won't be added
        set.add("2");
        set.add("3");
        set.add("4");

        System.out.println("size:" + set.size());

        String [] setarray =  set.toArray(new String[set.size()- 1]);
        for (int i = 0 ; i < setarray.length ; i++){
            System.out.print(" - " + setarray[i]);
        }
        System.out.println();

        for (String s : set){
            System.out.println(s);
        }
        System.out.println("bevat de lijst de waarde 4? " + set.contains("4"));

        System.out.println("=================================");

        //LinkedHashSet

        Set<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("1");
        linkedHashSet.add("1");  // also here can only contain unique members, so this one won't be added
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("4");


        System.out.println("size:" + linkedHashSet.size());

        for (String s : linkedHashSet){
            System.out.println(s);
        }

        System.out.println("bevat de lijst de waarde 4? " + linkedHashSet.contains("4"));


        System.out.println("=================================");
        //TreeSet


        Set<String> treeSet = new TreeSet<String>();

        treeSet.add("1");
        treeSet.add("1");  // also here can only contain unique members, so this one won't be added
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");

        System.out.println("size:" + treeSet.size());

        for (String s : treeSet){
            System.out.println(s);
        }

        System.out.println("bevat de lijst de waarde 4? " + treeSet.contains("4"));


    }
}
