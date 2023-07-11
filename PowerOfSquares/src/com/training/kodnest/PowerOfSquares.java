package com.training.kodnest;
import java.util.Scanner;
public class PowerOfSquares {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	scan.close();

System.out.println(squareNumber(num));
}
public static int squareNumber(int num)
{
	 return num*num;
}
}
