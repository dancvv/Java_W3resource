package Collection;

import java.util.HashSet;

//HashSet
public class h1 {
    public static void main(String[] args) {
//        1. Write a Java program to append the specified element to the end of a hash set
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
//        hashSet.add("Green");
//        set does not allow the repeat element
        System.out.println(hashSet);
    }
}
