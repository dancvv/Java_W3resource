package Array;

import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int num=numbers.length;
        Scanner in=new Scanner(System.in);
        int equal=in.nextInt();
        while (num!=0){
            if (numbers[num-1]==equal){
                System.out.println("equals and the num is :"+equal+"the index is "+num+" "+numbers[num-1]);
                break;
            }
            num-=1;

            }
        }

    }

