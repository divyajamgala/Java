package com.training.kodnest;

import java.util.Scanner;

public class TimeConverter {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int minutes=scan.nextInt();
	System.out.println(convertToHours(minutes));
	scan.close();
}
public static double convertToHours(int minutes)
{
	return (double)minutes/60;
}
}
