package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to copy one array list into another.
public class c9 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("white");
        list.add("yellow");
        list.add("black");
        Collections.copy(list,list2);
        System.out.println(list);
        System.out.println(list2);

    }
}
