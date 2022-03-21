package com.capgemini.day10;
import java.util.HashSet;
public class MySet {
	public static void main(String[] args) {
		
		// DOESNT TAKE DUPLICATE ELEMENTS
		//COLLECTIONS.SORT WORKS ONLY WITH LIST
		
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(1212);
		hset.add(121212);
		hset.add(1212);
		hset.add(435345);
		hset.add(232323);
	//      sort wont work on sets	Collections.sort(hset);
		System.out.println(hset);
		
	}
}
