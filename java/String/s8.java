package String;

import java.util.Scanner;

//Write a Java program to test if a given string contains the specified sequence of char values
public class s8 {
    public static void main(String[] args) {
        String str="PHP Exercises and Python Exercises ";
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        String test=in.nextLine();
        boolean result=str.contains(test);
        System.out.println("The string "+str+" contains the "+test+" which is "+result);
    }
}
