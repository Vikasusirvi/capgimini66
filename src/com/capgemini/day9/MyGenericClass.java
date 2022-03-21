package com.capgemini.day9;
//generic works with wrapper class


class genericEmployee<T>{
	private T id;
	public genericEmployee(T id) {
		this.id=id;
	}
	public void setId(T id) {
		this.id=id;
	}
	public T getId() {
		return this.id;
	}
	public void print() {
		System.out.print("ID is"+id);
	}

}
public class MyGenericClass {
	public static void main(String[]args) {
genericEmployee<String> emp=new genericEmployee<String>("vikas");
emp.print();
}}
git config --global user.email "vikasusirvi1999@gmail.com.com"
git config --global user.name "Vikas U Sirvi"