package com.kodnest.training;
import java.util.Scanner;
public class TemparatureConverterApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double fahrenheit=scan.nextDouble();
	TemparatureConverter t=new TemparatureConverter();
	System.out.printf("%.2f\n",t.convertFahrenheitToCelsius(fahrenheit));
	scan.close();
}
}
