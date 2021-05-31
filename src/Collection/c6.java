package Collection;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to remove the third element from a array list.
public class c6 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("yellow");
        list.remove(2);
        System.out.println(list);
    }
}
