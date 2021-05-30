package Array;

public class a2 {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,7};
        int num=0;
//        String a1="a";
//        String a2="b";
//        String a3="ab";
//        String a4=a1+a2;
//        System.out.println(a3==a4);
//        System.out.println(a3.equals(a4));
        for (int i=0;i<arr.length;i++){
            num=num+arr[i];

        }
        double ave ;
        ave = (double) num/arr.length;
        System.out.println(num);
        System.out.println("print the ave: "+ ave);
        //mai();
    }
    static void mai() {

        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
