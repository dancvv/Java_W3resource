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
        list2.add("1");
        list2.add("blue");
        list2.add("white");
        list2.add("yellow");
        list2.add("black");
        list2.add("2");
//        copy方法要两个list长度一致才可
        System.out.println("list2,"+list2);
        Collections.copy(list2,list);
        System.out.println(list);
        System.out.println(list2);
//        Write a Java program to compare two array lists.

//        17.Write a Java program to empty an array list.
        list2.clear();
        System.out.println(list2);
//        18.Write a Java program to test an array list is empty or not.
        boolean result=list2.isEmpty();
        System.out.println(result);
//        19. Write a Java program to trim the capacity of an array list the current list size.
        list.trimToSize();
        System.out.println(list);

    }
}
