package String;
// Write a Java program to find whether a region in the current string matches a region in another string.
public class s23 {
    public static void main(String[] args) {
        String str1=new String("matches a region in another string.");
        String str2=new String("region");
        String str3=new String("in another string.");
        System.out.println(str1.charAt(10));
        boolean re1=str1.regionMatches(10,str2,0,6);
        boolean re2=str1.regionMatches(20,str3,0,6);

        System.out.println(re1);
        System.out.println(re2);
        System.out.println(str1.contains(str3));


    }
}
