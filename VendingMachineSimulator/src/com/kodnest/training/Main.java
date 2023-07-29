package com.kodnest.training;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the product code:");
	String productcode=scan.next();
	scan.close();
	getProduct(productcode);
}
public static void getProduct(String productCode)

{
if(productCode=="P01")
{
	System.out.println("Coca cola");
}
else if(productCode=="P02")
{
	System.out.println("Mirinda");
}
else if(productCode=="P03")
{
	System.out.println("Sprite");
}
else if(productCode=="P04")
{
	System.out.println("Maaza");
}
else
{
	System.out.println("Thumbs up");
}


}
}
