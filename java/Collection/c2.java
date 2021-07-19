package Collection;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in a array list.
public class c2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
//        System.out.println(list);
        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
