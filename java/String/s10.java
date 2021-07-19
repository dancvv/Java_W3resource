package String;
// Write a Java program to compare a given string to the specified string buffer.
public class s10 {
    public static void main(String[] args) {
        String str1="example.com";
        String str2="Example.com";
        StringBuffer sbf=new StringBuffer(str1);
//        与指定字符缓冲区比较
        System.out.println(str1+" and " +sbf +"compare: "+str1.contentEquals(sbf));
        System.out.println(str2+" and " +sbf +"compare: "+str2.contentEquals(sbf));

//        stringBuffer的使用
//         StringBuffer 类是可变字符串类，创建 StringBuffer 类的对象后可以随意修改字符串的内容。类似于arrayList的用法，会自动增加容量。
        sbf.append(" new string");
        System.out.println(sbf);
//        substring可以从指定位置开始输出
        System.out.println(sbf.substring(5));


    }
}
