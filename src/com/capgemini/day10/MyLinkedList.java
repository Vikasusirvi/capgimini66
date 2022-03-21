
package com.capgemini.day10;
import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Object list1 = new LinkedList<Integer>();

		list.add(121);
		list.add(221);
		list.add(1212);
		list.add(4343);
		list.addFirst(121);
		list.addLast(323);
		System.out.println(list);
		list1 = list.clone();
		System.out.println(list1);
		System.out.println(list.contains(121));
		System.out.println(list.element());
		System.out.println(list.remove(2));
		
	}
}
