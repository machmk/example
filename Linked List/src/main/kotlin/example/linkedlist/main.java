package example.linkedlist;

import java.util.LinkedList;

public class main {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
//linked list as stack
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("E");
        list.push("F");
        list.push("H");


        System.out.println(list);
        list.pop();
        System.out.println(list);


        System.out.println("-".repeat(10));

        LinkedList<String> list1 = new LinkedList<>();

        //linked list as queue

        list1.offer("A");
        list1.offer("B");
        list1.offer("C");
        list1.offer("D");
        list1.offer("E");
        list1.offer("F");
        list1.offer("H");

        list1.add(6,"G");

        System.out.println(list1);
        list1.poll();
        System.out.println(list1);
        list1.remove("G");
        System.out.println(list1);



    }

}
