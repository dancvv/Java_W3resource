package Collection;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to update specific array element by given element.
public class c5 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("yellow");
        System.out.println("修改前");
        System.out.println(list);
        System.out.println("修改后");
        list.set(2,"pink");
        System.out.println(list);
    }
}
