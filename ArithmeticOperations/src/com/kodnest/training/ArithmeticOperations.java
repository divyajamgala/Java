package com.kodnest.training;
public class ArithmeticOperations {
public static void main(String[] args) {

		int res1=subtractNumbers(20,5);
		int res2=multiplyNumbers(4,5);
		double res3=divideNumbers(20,4);
		int res4=findRemainder(10, 3);
		System.out.println("the result of subtracting num2 from num1:"+res1);
		System.out.println("the result of multiplying num1 and num2:"+res2);
		System.out.printf("the result of dividing num1 by num2:Round off the result till 2 decimal places :%.2f\n",res3);
		System.out.println("the remainder when num1 is divided by num2:"+res4);
			
		}
		public static int subtractNumbers(int num1, int num2)
		{
			return num2-num1;
		}
		public static int multiplyNumbers(int num1, int num2)
		{
			return num1*num2;
		}
		public static double divideNumbers(int num1, int num2)
		{
			return num1/num2;

		}
		public static int findRemainder(int num1, int num2)
		{
			return num1%num2;
		}
}
