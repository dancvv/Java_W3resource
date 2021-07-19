package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Write a Java program to get the last index of a string within a string.
public class s21 {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog.";
        int num=0;
        Map<Character,Integer> map=new HashMap<>();

        while (str.length()!=num){
            System.out.println("character: "+str.charAt(num));
            char cha=str.charAt(num);
            System.out.println("the last index of "+str.lastIndexOf(cha));
            map.put(cha, str.lastIndexOf(cha));
            num+=1;
        }
        System.out.println(num+"len: "+str.length());
        System.out.println(map);
    }
}
