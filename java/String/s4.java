package String;

import java.util.Scanner;
// Write a Java program to count a number of Unicode code points in the specified text range of a String
public class s4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input");
        String str=in.nextLine();
        System.out.println("The num of unicode: "+str.codePointCount(0,str.length()));
    }
}
