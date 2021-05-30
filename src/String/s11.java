package String;
//  Write a Java program to create a new String object with the contents of a character array.
public class s11 {
    public static void main(String[] args) {
        char array[]={'1','2','3','4'};
        String str="";
        str=str.copyValueOf(array,1,2);
        System.out.println("the book contains "+str+" pages");

    }
}
