package String;
//Write a Java program to replace each substring of a given string that matches
// the given regular expression with the given replacement.
public class s25 {
    public static void main(String[] args) {
        String str="the quick brown fox jumps over the lazy dog. ";
        String newStr=str.replaceAll("the","a");
        String newStr2=str.replace("the","a");
        System.out.println("old "+newStr2);
        System.out.println(newStr);
    }
}
