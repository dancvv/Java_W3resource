package Numbers;

import java.util.Scanner;

public class SpecificRange {
    public static void main(String[] args) {
        double num;
//        输出-2~+2
        Scanner in=new Scanner(System.in);
        System.out.println("start");
        int start=in.nextInt();
        System.out.println("end");
        int end=in.nextInt();
        int endNum=start+(int)(Math.random()*((end-start)+1));
        System.out.println(endNum);
//        for(int i=0;i<10;i++){
//        num=Math.random()*10;
//        int intNum=(int) num;
//        System.out.println(num);
//        System.out.println(intNum);
//    }
}
}
