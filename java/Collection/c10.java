package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to shuffle elements in a array list.
public class c10 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("white");
        list.add("yellow");
        list.add("black");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
