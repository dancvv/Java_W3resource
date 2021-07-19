package String;
//Write a Java program to compare a given string to another string, ignoring case considerations.
public class s14 {
    public static void main(String[] args) {
        String str1="Stephen Edwin King";
        String str2="Walter Winchell";
        String str3="stephen edwin king";
        boolean re1=str1.equalsIgnoreCase(str2);
        boolean re2=str1.equalsIgnoreCase(str3);
        System.out.println(str1+" equals "+ str2 +" is " +re1);
        System.out.println(str1+" equals "+ str3 +" is " +re2);
    }
}
