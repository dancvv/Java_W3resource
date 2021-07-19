package String;
//Write a Java program to get the contents of a given string as a byte array.
public class s16 {
    public static void main(String[] args) {
        String str="The new String equals";
        char[] str2=new char[8];
        String newStr="";
        str.getChars(4,12,str2,0);
        System.out.println(str2);
        byte[] byteChar=str.getBytes();
        System.out.println("----------------------");
        String array=new String(byteChar);
        System.out.println(array);

    }
}
