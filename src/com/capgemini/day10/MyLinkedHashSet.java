package com.capgemini.day10;

import java.util.Iterator;
import java.util.TreeSet;
//USED WHEN INSERTION ORDER IS TO BE MAINTAINED
//USED WHEN DUPLICATES ARE TO NOT BE PRESENT IN THE SET

// since collections.srt() wont work on sort, use treeset to sort

public class MyLinkedHashSet {
 public static void main(String[] args) {
	 
	 TreeSet<Integer> as = new TreeSet<Integer>();
	 as.add(1121);
	 as.add(1122);
	 as.add(1121);
	 as.add(12121);
	 System.out.println(as);
	 System.out.println(as);
	 as.toArray();
	 Iterator<Integer> itt = as.iterator();
	 while( itt.hasNext()) {
		 System.out.println(itt.next());
	 }
	 Iterator<Integer> itr = as.descendingIterator();
	 while (itr.hasNext()) {
		 System.out.println(itr.next());
	 }
 }
}
