package Array;

import java.util.ArrayList;

//Write a Java program to remove a specific element from an array.
public class s7 {
    public static int[] remove(int[] num,int rem){
        int length=num.length-1;
        while (length!=0){
            if (rem==num[length]){
                num[length]=0;
                System.out.println("the num is "+rem+" index "+length);
//                此处容易超出所以减去1
//                也可以不用交换，直接前一位等于后一位
                for(int len=length;len<num.length-1;len++){
                    int temp=0;
                    temp=num[len];
                    num[len]=num[len+1];
                    num[len+1]=temp;
                }

            }else {
                length-=1;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100,60};
        int[] newNum=remove(numbers ,30);
        System.out.println(newNum);
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for (int num1:newNum){
            list1.add(num1);
        }
        for (int num:numbers){
            list2.add(num);
        }
        System.out.println("origin");
        System.out.println(list1);
        System.out.println("new");
        System.out.println(list2);
    }
}
