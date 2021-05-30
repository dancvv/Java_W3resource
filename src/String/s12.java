package String;

import java.util.Scanner;

// Write a Java program to check whether a given string ends with the contents of another string.
public class s12 {
    public static void main(String[] args) {
        String str1="Python Exercises";
        String str2="Python Exercise";
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(str1+" ends with "+str+"which is "+str1.endsWith(str));
        System.out.println(str2+" ends with "+str+"which is "+str2.endsWith(str));
    }
}
