package com.kodnest.training;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=0;
	int b=1;
	System.out.println("Enter the range:");
	int n=scan.nextInt();
	scan.close();
	if(n==0)
	{
		System.out.println(a);
	}
	else if(n==1)
	{
		System.out.println(a+" "+b);
	}
	else
	{
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++)
		{
			int nextno=a+b;
			System.out.print(nextno+" ");
			a=b;
			b=nextno;
		}
	}
}
}
