package String;
//Write a Java program to compare two strings lexicographically. Two strings are lexicographically
// equal if they are the same length and contain the same characters in the same positions.
public class s5 {
    public static void main(String[] args) {
        String str1= "the String1";
        String str2= "the String2";
        int equals=str1.compareTo(str2);
        System.out.println(equals);
        if (equals>0){
            System.out.println(str1+" is larger than "+str2);
        }else if (equals==0){
            System.out.println(str1+" is equal to "+str2);
        }else{
            System.out.println(str1+" is less than "+str2);
        }

    }
}
