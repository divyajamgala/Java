package com.kodnest.training;

import java.util.Scanner;

public class ArmstrongApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	Armstrong a= new Armstrong();
	int power=a.find(n);
	int res1=a.finding(n,power);
	scan.close();
	if(res1==n)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("not Armstrong");
	}
}
}
