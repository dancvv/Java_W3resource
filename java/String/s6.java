package String;
//6
// Write a Java program to compare two strings lexicographically, ignoring case differences.

public class s6 {
    public static void main(String[] args) {
        String str1="This is exercise 1";
        String str2="This is Exercise 1";
        boolean result1=str1.equals(str2);
        boolean result=str1.equalsIgnoreCase(str2);
        if(result==true){
            System.out.println(str1+" is equal to "+str2);
        }else {
            System.out.println("the two strings are not equal");
        }

    }
}
