package String;

import java.util.Scanner;

//Write a Java program to get the contents of a given string as a character array.
public class s17 {
    public static void main(String[] args) {
        String str="Write a Java program to";
        char[] character=str.toCharArray();
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int endNum=in.nextInt();
        StringBuffer sbf=new StringBuffer();
        while (num!=endNum){
            sbf.append(character[num-1]);
            num+=1;
        }
        System.out.println(sbf);
        System.out.println("------------------");
        second();
    }
    static void second(){
        String str="This is a sample string.";
        char[] str2 = new char[6];
        str.getChars(1,5,str2,0);
        System.out.println(str2.hashCode());
    }

}
