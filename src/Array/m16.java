package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Write a Java method to find all twin prime numbers less than 100
//complex method
public class m16 {
    static ArrayList<Integer> method(){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> sublist=new ArrayList<>();
        for (int i=1;i<=100;i++){
            if (i%2==0){
                continue;
            }else if (i%3==0){
                continue;
            }else if (i!=5&i%5==0){
                continue;
            }else {
                list.add(i);
            }
        }
        return list;
    }
    static Map<Integer,Integer> prime(){
        ArrayList<Integer> sublist=new ArrayList<>();
        sublist=method();
//        The array must have a length
        int[] arr=new int[sublist.toArray().length];
        int i=0;
        Map<Integer,Integer> map=new HashMap<>();
        Iterator it= sublist.iterator();
        while (it.hasNext()){
            arr[i]=(Integer) it.next();
            i++;
        }
        for (int j=1;j<arr.length;j++){
            int temp;
            temp=arr[j]+2;
            if (j+1>=arr.length){
                break;
            }else if (temp==arr[j+1]){
                map.put(arr[j],arr[j+1]);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map=prime();
        System.out.println(map);
    }
}
