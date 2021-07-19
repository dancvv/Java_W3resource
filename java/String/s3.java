package String;

import java.util.Scanner;
//  Write a Java program to get the character (Unicode code point) before the specified index within the String
public class s3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input");
        String str=in.nextLine();
        int firstNum = in.nextInt();
        int secondNum = in.nextInt();
        System.out.println("Original String: "+str);
        System.out.println("Character (unicode point) = "+str.codePointAt(firstNum-1)+" and the character is "+str.charAt(firstNum-1));
        System.out.println("Character (unicode point) = "+str.codePointAt(secondNum-1)+" and the character is "+str.charAt(secondNum-1));
    }
}
