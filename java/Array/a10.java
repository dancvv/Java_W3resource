package Array;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to find the maximum and minimum value of an array.
public class a10 {
    static Map<String,Integer> maxmin(int[] arr){
        int len=arr.length;
        int max=arr[0];
        int min=arr[0];
        for (int i=0; i<len-1;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        Map map= new HashMap();
        map.put("max",max);
        map.put("min",min);
        return map;
    }

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Map map=new HashMap();
        map=maxmin(my_array);
        System.out.println(map);
    }
}
