package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Write a Java program to sort a given array list.
public class c8 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("white");
        list.add("yellow");
        list.add("black");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
//        反转顺序
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
