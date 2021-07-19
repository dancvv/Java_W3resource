package String;
//Write a Java program to find all interleavings of given strings.
public class s37 {
    public static void main(String[] args) {
        String str="pickoutthelongestsubstring";
        char[] chars=str.toCharArray();
        StringBuffer sbf= new StringBuffer();
        for (int i=0;i<str.length();i++){
            sbf.append(chars[i]);

        }
    }

}
