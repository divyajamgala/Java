package com.training.kodnest;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	calculateSumOfDigits(n);
	scan.close();
}
public static void calculateSumOfDigits(int n) 
{
	int sum=0;
	while(n!=0)
	{
    int rem=n%10;
	sum=sum+rem;
	n=n/10;
	}
	System.out.println(sum);
	}
}
