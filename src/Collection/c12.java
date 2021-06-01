package Collection;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to extract a portion of a array list.
public class c12 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("white");
        list.add("yellow");
        list.add("black");
        List sbu=list.subList(1,3);
        System.out.println(sbu);

    }
}
