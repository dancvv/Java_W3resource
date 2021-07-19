package String;
//Write a Java program to check whether two String objects contain the same data.
public class s13 {
    public static void main(String[] args) {
        String str1="Python Exercises";
        String str2="Python Exercise";
        boolean result = str1.equals(str2);
        System.out.println(str1+" is "+result+" to "+str2);
    }
}
