package Array;
//Write a Java program to copy an array by iterating the array.
public class s8 {
    static int[] copy(int[] arr){
        int len=arr.length-1;
        int[] copyArr=new int[len];
        for (int i=0;i<len;i++){
            copyArr[i]=arr[i];
        }
        return copyArr;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100,60};
        int[] newArr=copy(numbers);
        for(int ele:newArr){
            System.out.println(ele);
        }

    }
}
