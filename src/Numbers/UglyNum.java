package Numbers;

import java.util.Scanner;

public class UglyNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input");
        int num=in.nextInt();
        int num1=num%2;
        int num2=num%3;
        int num3=num%5;

        if (num1==0 ){
            System.out.println("It is not an ugly number.");
        }else if(num2==0 ){
            System.out.println("It is not an ugly number.");
        }else if ( num3==0){
            System.out.println("It is not an ugly number.");
        }else {
            System.out.println("It is an ugly number.");
        }

    }




}
