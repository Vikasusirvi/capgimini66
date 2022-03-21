package com.capgemini.day11;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SDSD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n;
		int sum=0;
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			n=Integer.parseInt(temp);
			sum+=n;
		}
		System.out.println(sum);
	}

}
