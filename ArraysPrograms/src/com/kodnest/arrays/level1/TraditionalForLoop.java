package com.kodnest.arrays.level1;

import java.util.Scanner;

public class TraditionalForLoop {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the range of elements:");
	int [] arr=new int[scan.nextInt()];
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	scan.close();
}
}
