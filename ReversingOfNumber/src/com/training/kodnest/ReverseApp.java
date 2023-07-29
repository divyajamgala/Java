package com.training.kodnest;

import java.util.Scanner;

public class ReverseApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	Reverse r=new Reverse();
	System.out.println(r.find(n));
	scan.close();
}
}
