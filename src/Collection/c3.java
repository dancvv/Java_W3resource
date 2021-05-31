package Collection;

import java.util.ArrayList;
import java.util.Iterator;

// Write a Java program to insert an element into the array list at the first position.
public class c3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
        list2.add("yellow");
        Iterator it=list.iterator();
        while (it.hasNext()){
            String str=(String) it.next();
            list2.add(str);
        }
        System.out.println(list2);
        list2.add(0,"pink");
        System.out.println(list2);
    }
}
