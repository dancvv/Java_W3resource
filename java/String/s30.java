package String;

import java.util.Locale;

//Write a Java program to convert all the characters in a string to uppercase.
public class s30 {
    public static void main(String[] args) {
        String str="The Quick BroWn FoX!";
        String newStr=str.toUpperCase();
        String new2Str=str.toUpperCase(Locale.ROOT);
        System.out.println("first up: "+newStr);
        System.out.println("second up: "+new2Str);
//        两者没有什么区别

    }
}
