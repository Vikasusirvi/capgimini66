package com.capgemini.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreamAPI {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(133);
		lst.add(123);
		lst.add(10232);
		lst.add(1230);
		lst.add(10232);
		// STREAM OBJECT IS CREATED

		Stream<Integer> str = lst.stream();

		// STREAM OBJECTED CAN BE USED ONCE ONLY AND THEN FOR NEXT USE LST.STREAM()
		// DIRECTLY

		str.forEach(a -> System.out.println(a));
		List<Integer> lst2 = new ArrayList<Integer>();
		List<Integer> lst3 = new ArrayList<Integer>();
		List<Integer> lst4 = new ArrayList<Integer>();
		lst.stream().forEach(System.out::println);
		lst4 = lst.stream().sorted(Collections.reverseOrder()).filter(a -> a % 2 == 0).toList();
		System.out.println(lst4);

		// System.out.println(lst4);
		// System.out.println((lst.stream().filter(a->(a>125))).getClass());

		lst2 = lst.stream().filter(a -> (a > 125)).map(a -> a).collect(Collectors.toList());
		System.out.println(lst2);

		// MAP IS USED TO MANIPULATE THE VALUES OF STREAN ELEMENTS WHILE FILTER JUST
		// CONTROLS WHICH ELEMENT IS TO BE PASSED

		lst3 = lst.stream().filter(a -> (a > 125)).map(a -> a * a).toList();
		System.out.println(lst3);
	}
}
