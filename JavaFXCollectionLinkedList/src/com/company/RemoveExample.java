package com.company;

import java.util.LinkedList;

public class RemoveExample {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Item1");
        linkedList.add("Item2");
        linkedList.add("Item3");
        linkedList.add("Item4");
        linkedList.add("Item5");

        //ispis liste
        System.out.println("Before Remove: ");
        for(String str: linkedList){
            System.out.println(str);
        }
        // uklanjanje elemenata liste
        linkedList.remove("Item3");

        // ispis liste nakon uklanjanja elemeanata
        System.out.println("\n After remove:");
        for(String str2: linkedList){
            System.out.println(str2);
        }

    }
}
