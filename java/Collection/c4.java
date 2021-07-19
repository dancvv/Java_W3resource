package Collection;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list.
public class c4 {
    static Object retrieve(ArrayList<?> arrayList,int index){
        index=index+1;
//        arrayList.get(12);
        return arrayList.get(index);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(23);
        arr.add(3);
        arr.add(23);
        int tr=arr.get(3);
        ArrayList<String> list=new ArrayList<>();
        list.add("green");
        list.add("red");
        list.add("blue");
        list.add("yellow");
//        index处理过，直观输入
        Object trr=retrieve(arr,2);
        System.out.println(trr);
        System.out.println(list.get(3));

    }
}
