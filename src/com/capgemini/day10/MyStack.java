package com.capgemini.day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class MyStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(121);
		stack.add(123);
		stack.add(124);
		stack.add(125);
		stack.addAll(stack);
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.add(24);
		list.add(26);
		System.out.println(stack.addAll(list));
		System.out.println(stack.capacity());
		Object obj = stack.clone();
		System.out.println(obj);
		System.out.println(stack.contains(121));
		System.out.println("last index:  "+stack.lastIndexOf(124));
		System.out.println(stack.pop());
		Iterator<Integer> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(stack,Collections.reverseOrder());
		System.out.println(stack);
		
	
		
		
		
		
	 }

}
