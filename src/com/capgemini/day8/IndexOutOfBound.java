package com.capgemini.day8;
public class IndexOutOfBound{
	public static void main(String[] args) {
		try{
		int  a[]=new int[20];
		a[1]=3;
		a[0]=2;
		System.out.print(a[19]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("index is out of bound");
		}
	}
}
