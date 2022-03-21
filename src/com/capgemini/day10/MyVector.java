package com.capgemini.day10;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
public class MyVector {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(121);
		vec.add(123);
		vec.add(124);
		vec.add(125);
		vec.addAll(vec);
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.add(24);
		list.add(26);
		System.out.println(vec.addAll(list));
		System.out.println(vec.capacity());
		Object obj = vec.clone();
		System.out.println(obj);
		System.out.println(vec.contains(121));
		System.out.println("last index:  "+vec.lastIndexOf(124));
		System.out.println(vec.lastIndexOf(121, 7));
		Iterator<Integer> itr = vec.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(vec,Collections.reverseOrder());
		System.out.println(vec);
}
}

