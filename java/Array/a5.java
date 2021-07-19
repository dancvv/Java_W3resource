package Array;

import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int num=numbers.length-1;
        System.out.println("input the specific num:");
        Scanner in=new Scanner(System.in);
        int equal=in.nextInt();
        while (num!=0){
            if (numbers[num]==equal){
                System.out.println("equals and the num is :"+equal+"the index is "+num+" "+numbers[num]);
                break;
            }else {
                num-=1;
            }
            }
        }

    }
