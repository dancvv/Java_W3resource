package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to reverse elements in a array list.
public class c11 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("white");
        list.add("yellow");
        list.add("black");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
