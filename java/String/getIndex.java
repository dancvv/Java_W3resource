package String;

import java.util.Scanner;

public class getIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input");
        String string = in.nextLine();
        System.out.println(string.length());
        int start=in.nextInt();
        if (start<string.length()){
            System.out.println("The character at position "+start+" is "+ string.charAt(start-1));
        }else {
            System.out.println("wrong range");
        }


    }
}
