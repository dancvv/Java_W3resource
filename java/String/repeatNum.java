package String;

import java.util.Scanner;

//106
public class repeatNum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("String");
        String string=in.nextLine();
        System.out.println("int");
        int times=in.nextInt();
        String strings="";
        String stringNum="";
        for (int i=0;i<times;i++){
            strings = strings+string;
        }
        while (times>0){
            stringNum=stringNum+string;
            times=times-1;
        }
        System.out.println(strings);
        System.out.println("-------------------");
        System.out.println(stringNum);
        System.out.println(times);
        System.out.println("-------------");
        String outStr=repeat("str",5);
        System.out.println(outStr);
    }
    public static String repeat(String str,int repeat){
        StringBuilder sbd = new StringBuilder();
        for (int i=0;i<repeat;i++){
            sbd.append(str);
        }
        return sbd.toString();
    }
}
