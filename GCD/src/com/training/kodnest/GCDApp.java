package com.training.kodnest;
import java.util.Scanner;

public class GCDApp {
 
public static void main(String[] args) {
	Scanner  scan=new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int m=scan.nextInt();
	int n=scan.nextInt();
	GCD.findGCD(m,n);
	scan.close();
	System.out.println(m);
}
}




