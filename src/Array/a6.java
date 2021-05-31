package Array;

import java.util.Scanner;
// Write a Java program to find the index of an array element.
public class a6 {
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100,60};
        Scanner in=new Scanner(System.in);
        int input=in.nextInt();
        int num=numbers.length-1;
        while (num!=0){
            if (input==numbers[num]){
                System.out.println("the num in the array and the index is "+num+"="+input+" "+numbers[num]);
            }
            num-=1;
        }

    }
}
