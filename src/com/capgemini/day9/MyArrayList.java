package com.capgemini.day9;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
	public static void main(String[] args) {
		// must use wrapper class to define the type of arraylist

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1212);
		al.add(12121);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1212212);
		al1.add(121212121);
		al.addAll(al1);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		for (Object e : al) {
			System.out.println(e);
		}
		System.out.println(al.get(1));
		System.out.println(al.contains(1212));
		System.out.println("index of function:  " + al.indexOf(1212));
		System.out.println("remove function: " + al.remove(1));

	}
}
