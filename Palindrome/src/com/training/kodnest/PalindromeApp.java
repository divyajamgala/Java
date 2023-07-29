package com.training.kodnest;

import java.util.Scanner;

public class PalindromeApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();
	Palindrome r=new Palindrome();
	int res=r.find(n);
	scan.close();
	if(res==n)
	{
		System.out.println("Entered number is palindrome");
	}
	else
	{
		System.out.println("Entered number is not palindrome");
	}
}
}
