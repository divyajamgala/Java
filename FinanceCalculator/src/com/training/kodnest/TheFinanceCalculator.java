package com.training.kodnest;

import java.util.Scanner;

public class TheFinanceCalculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double principal=scan.nextDouble();
	double rate=scan.nextDouble();
	double time=scan.nextDouble();
	FinanceCalculator calculator = new FinanceCalculator();

	System.out.printf("%.2f",calculator.calculateSimpleInterest(principal,rate,time));
	scan.close();
	}
}