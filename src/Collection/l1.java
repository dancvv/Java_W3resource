package Collection;

import java.util.*;

//1. Write a Java program to append the specified element to the end of a linked list.
public class l1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.addLast(56);
        System.out.println(linkedList);
//        2.Write a Java program to iterate through all elements in a linked list.
        l2(linkedList);
//        3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        l3(linkedList,3);
//        4.Write a Java program to iterate a linked list in reverse order.
        l4(linkedList);
//        5. Write a Java program to insert the specified element at the specified position in the linked list.
        l5(linkedList,6,5656);
//        6. Write a Java program to insert elements into the linked list at the first and last position.
        linkedList.addFirst(898);
        linkedList.addLast(89989);
        System.out.println(linkedList);
//        7. Write a Java program to insert the specified element at the front of a linked list.
        linkedList.offerFirst(100);
        System.out.println(linkedList);
//        9. Write a Java program to insert some elements at the specified position into a linked list.
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(30);
        linkedList.addAll(1,list);
        System.out.println(linkedList);
//        10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println("the first element: "+linkedList.getFirst());
        System.out.println("the last element: "+linkedList.getLast());
//        11. Write a Java program to display the elements and their positions in a linked list.
        l11(linkedList);
//        12. Write a Java program to remove a specified element from a linked list.
        System.out.println("original: " +linkedList);
        System.out.println(linkedList.remove(5));
        System.out.println("changed: "+linkedList);
//        13. Write a Java program to remove first and last element from a linked list.
        System.out.println("remove first: "+linkedList.removeFirst()+" remove last: "+linkedList.removeLast());
//        14. Write a Java program to remove all the elements from a linked list.
//        linkedList.removeAll(linkedList);
        System.out.println(linkedList);
//        15. Write a Java program of swap two elements in a linked list.
        Collections.swap(linkedList,0,3);
        System.out.println(linkedList);
//        16. Write a Java program to shuffle the elements in a linked list.
//        random break the list
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
//        17. Write a Java program to join two linked lists.
//        18. Write a Java program to clone an linked list to another linked list.
        LinkedList<Integer> lin=(LinkedList<Integer>) linkedList.clone();
        System.out.println("copy:"+lin);
//        23. Write a Java program to convert a linked list to array list.
        Object[] arrlist=linkedList.toArray();
        Object[] arrlist2=linkedList.toArray();
        for (int i=0;i<arrlist2.length;i++){
            System.out.println(arrlist2[i]);
        }
        System.out.println(arrlist2);

    }

    private static void l4(LinkedList<?> linkedList ) {
        System.out.println("start l4()---------------------");
        System.out.println("original: "+linkedList);
        Iterator iterator= linkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("end l4()---------------------");
    }
    private static void l5(LinkedList<Integer> linkedList, int index, int num) {
        System.out.println("start l5()---------------------");
        linkedList.set(index,num);
        System.out.println(linkedList);
        System.out.println("end l5()---------------------");
    }
    private static void l11(LinkedList<?> linkedList ) {
        System.out.println("start l11()---------------------");
//        ListIterator iterator=linkedList.listIterator();
//        while (iterator.hasNext()){
//            int num=linkedList.indexOf(iterator.next());
//            System.out.println("the index of "+iterator.next()+" is "+num);
//        }
        int len=linkedList.size();
        for(int i=0;i<len;i++){
            System.out.println(linkedList.get(i)+" the index "+i);
        }
        System.out.println("end l11()---------------------");
    }
    private static void l7(LinkedList<?> linkedList ) {
        System.out.println("start l4()---------------------");
        System.out.println("end l4()---------------------");
    }
    private static void l8(LinkedList<?> linkedList ) {
        System.out.println("start l4()---------------------");
        System.out.println("end l4()---------------------");
    }

    private static void l3(LinkedList<?> linkedList,int index) {
        System.out.println("start l3()---------------------");
        Iterator listIt=linkedList.listIterator(index);
        while (listIt.hasNext()){
            System.out.println(listIt.next());
        }
        System.out.println("end l3()----------------------");

    }

    static void l2(LinkedList<?> linkedList){
        System.out.println("start l2()---------------------");
        Iterator it=linkedList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("end l2()----------------------");
    }
}
