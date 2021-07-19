package String;
// Write a Java program to check whether a given string starts with the contents of another string.
public class s26 {
    public static void main(String[] args) {
        String str1="Red is favorite color.";
        String str2="Orange is favorite color.";
        boolean re1=str1.startsWith("red");
        boolean re2=str2.startsWith("Orange");
        System.out.println("first "+re1);
        System.out.println("second "+re2);

    }
}
