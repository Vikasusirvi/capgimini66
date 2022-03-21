package com.capgemini.day8;
abstract interface Student
{
	public void Sendsms();
	public void Call();
	
}
 class Samsung extends Mobile implements Student{
	@Override
	 public void Use() {
		System.out.println("Samsung can place CALL");
	}
	@Override
	 public void Sendsms() {
		System.out.println("Samsung can send sms");
	}
	@Override
	 public void Call() {
		System.out.println("Samsung can call");
	}
	
}
 class Dell extends Laptop implements Student{
		@Override
		 public void Use() {
			System.out.println("Dell laptop Allows to run applications");
		}
		@Override
		 public void Sendsms() {
			System.out.println("Dell can send sms");
		}
		@Override
		 public void Call() {
			System.out.println("Dell laptops cannot call");
		}
 }
 class LG extends Tv implements Student{
		@Override
		 public void Use() {
			System.out.println("LG tvs allow to watch movies");
		}
		@Override
		 public void Sendsms() {
			System.out.println("LG cannot send sms");
		}
		@Override
		 public void Call() {
			System.out.println("LG cannot call");
		}
 }
 abstract class Mobile{
	 public abstract void Use(); 
 }
 abstract class Laptop{
	 public abstract void Use(); 
 }
 abstract class Tv{
	 public abstract void Use(); 
 }
 //dsads,dna,dn,dnasd,nasd,nd,adsna,dnas,m
 
public class MyAbstractions {
	
	public static void main(String args[]) {
 Samsung SSS= new Samsung();
 System.out.println("vikas");
 SSS.Use();
 SSS.Sendsms();
 SSS.Call();
 Dell ddd= new Dell();
 ddd.Use();
 ddd.Sendsms();
 ddd.Call();
 LG lll= new LG();
 lll.Use();
 lll.Sendsms();
 lll.Call();
}
}
