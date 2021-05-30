package Array;

import java.util.Arrays;
import java.util.Iterator;

public class s1 {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        int[] my_array2 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

//        采用冒泡排序
        for(int i=0;i<my_array1.length-1;i++){
            for (int j=0;j<my_array1.length-1;j++){
                if (my_array1[j]>my_array1[j+1]){
                    int temp=my_array1[j+1];
                    my_array1[j+1]=my_array1[i];
                    my_array1[j]=temp;
                }
                }

            }
        Arrays.sort(my_array2);
        System.out.println(my_array2);
        for(int element:my_array2){
            System.out.println(element);
        }
//        Iterator it = Iterator(my_array2);
        }
}
