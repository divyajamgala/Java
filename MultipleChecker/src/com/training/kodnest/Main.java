package com.training.kodnest;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter two numbers:");
int n=scan.nextInt();
int m=scan.nextInt();
scan.close();
checkMultipleOfTen(n,m);
}

public static void checkMultipleOfTen(int n,int m)

{

if(n%m==0)
{
	System.out.println("The number "+n+" is multiple of :"+m);
}
else
{
	System.out.println("The number "+n+" is not multiple of :"+m);
}
}


}
