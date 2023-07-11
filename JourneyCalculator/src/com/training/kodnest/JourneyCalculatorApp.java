package com.training.kodnest;

import java.util.Scanner;

public class JourneyCalculatorApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double Speed=scan.nextDouble();
	double time=scan.nextDouble();
	JourneyCalculator j=new JourneyCalculator();
	double distance=j.calculateDistance(Speed,time);
	System.out.printf("%.2f",distance);
	scan.close();
	
}
}
