package Collection;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to search an element in a array list.
public class c7 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("yellow");
        boolean rel=list.contains("red");
        System.out.println(rel);
    }
}
