package top.zgpv_09;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("a");

        linkedList.addFirst("b");

        linkedList.addLast("c");

        String peek = (String)linkedList.peek();
        System.out.println(peek);

        String peek1 = (String) linkedList.peekLast();
        System.out.println(peek1);

        linkedList.push("d");


        System.out.println(linkedList);

        System.out.println("--------------------");



    }
}
