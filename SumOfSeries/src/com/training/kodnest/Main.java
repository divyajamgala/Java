package com.training.kodnest;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	calculateSumOfSeries(n);
	scan.close();
}
public static void calculateSumOfSeries(int n)

{
	double sum=0;
	for(int i=1;i<=n;i++)
	{
     sum=sum+1.0/i;
	}
	System.out.println(sum);
}

}