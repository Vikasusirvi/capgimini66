package com.capgemini.day8;

import java.util.Scanner;
//don't put try and catch for unchecked exception
//for checked exception  the exception needs to be handled using try
class PositiveNumberException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PositiveNumberException(){
		super("it is a non positive2 number");
	}
	PositiveNumberException(String msg){
		super(msg);
	}
}
public class Checked {
	public static void main(String[] args) {
		int num;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an even number \n");
		num=sc.nextInt();
	//try {	
		if(num > 0) 
		{
			if(num == 1)
				System.out.println("it is not a prime number \t"+num);
			
			else if(num == 2)
				System.out.println("it is a prime number"+num);
			else 
			{
				for(int i=2;i<num/2;i++) {
					if(num%i==0)
					{
						System.out.println("Its is not a prime number"+num);
						System.exit(0);
					}
					
				}
			}
		}
		else 
			throw new PositiveNumberException();
	//}
	//catch (PositiveNumberException e) {
		//System.out.println("exception occurred and caught");
	//}
	}

}
