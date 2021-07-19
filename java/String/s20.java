package String;
//Write a Java program to get the canonical representation of the string object.
public class s20 {
    public static void main(String[] args) {
        String str1="JavaExercise";
        String str2=new StringBuffer("Java").append("Exercise").toString();
        String str3=str2.intern();
        System.out.println(str2);
        System.out.println("str1 == str2? "+(str1==str2));
        System.out.println("str1 == str3? "+(str1==str3));
        System.out.println("str2 == str3? "+(str2==str3));
//        equal判断字符串内容是否相等
//        ==判断的不是内容，而是地址是否处于一个位置
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str2));
    }
}
