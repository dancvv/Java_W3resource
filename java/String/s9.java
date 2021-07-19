package String;
//Write a Java program to compare a given string to the specified character sequence
public class s9 {
    public static void main(String[] args) {
        String str1="example.com";
        String str2="Example.com";
        boolean result=str1.equals(str2);
        boolean result2=str1.equalsIgnoreCase(str2);
        System.out.println(result);
        System.out.println("Ingore the difference cases: "+result2);
    }

}
