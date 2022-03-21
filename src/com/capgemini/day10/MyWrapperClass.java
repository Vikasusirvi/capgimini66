package com.capgemini.day10;

public class MyWrapperClass {
 public static void main(String[] args) {
	 @SuppressWarnings("removal")
	Integer i1 = new Integer(12);
	 float f1=i1.floatValue();
	 System.out.println(f1);
	 System.out.println(i1.compareTo(210));
	 Integer i2=Integer.parseInt("-12112");
	 System.out.println(i2);
 }
}
