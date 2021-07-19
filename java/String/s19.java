package String;

public class s19 {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog.";
        byte[] chars=str.getBytes();
        int num=0;
        while (str.length()!=num){
//            System.out.println("the "+ num +" of string \""+str+"\" is "+str.charAt(num));
//            System.out.println("get the unicode: "+str.codePointAt(num));
            System.out.println("Corresponding "+str.charAt(num));
            System.out.println("the index of string "+str.indexOf(str.charAt(num)));
            num+=1;
        }

    }
}
