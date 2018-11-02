package com.example.mike.fridaytest;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {

        // Linked list testing
        System.out.println( "STRING LINKED LIST" );
        String s = "qbsdefgh";
        StringLinkedList stringLinkedList = new StringLinkedList(s);

        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(stringLinkedList.get(i));
            String s2 = String.valueOf(s.charAt(i));
            System.out.println(s1+"=="+s2);
        }
        System.out.println( "Size of stringLinkedList="+stringLinkedList.size() );
        System.out.println( "--------------------------------------" );

        // Queue
        System.out.println( "QUEUE" );
        CustomQueue queue = new CustomQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println("Stack size="+queue.stack.size());
        System.out.println("Dequeueing queue:"+queue.deQueue());
        System.out.println("Stack size="+queue.stack.size());
        System.out.println("Dequeueing queue:"+queue.deQueue());
        System.out.println("Stack size="+queue.stack.size());
        System.out.println("Dequeueing queue:"+queue.deQueue());
        System.out.println("Stack size="+queue.stack.size());
        System.out.println( "--------------------------------------" );

        // CustomArrayList
        System.out.println( "ARRAY LIST" );
        CustomArrayList<Integer> arrayList = new CustomArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList.toString());
        arrayList.remove(1);
        System.out.println(arrayList.toString());

        System.out.println( "--------------------------------------" );

        // Custom Binary Tree
        System.out.println( "CUSTOM BINARY TREE" );
        Integer integers[] = {50,32,13,65,34,22,3,76,90};

        CustomBinaryTree customBinaryTree = new CustomBinaryTree();

        for (Integer integer : integers) {
            customBinaryTree.add(integer);
        }

        System.out.println(customBinaryTree.toString());
        System.out.println( "--------------------------------------" );
    }

}
