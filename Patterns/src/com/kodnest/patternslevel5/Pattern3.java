package com.kodnest.patternslevel5;

public class Pattern3 {
public static void main(String[] args) {
for (int i = 1; i <= 3; i++)
{
for (int j =3; j > i; j--)
{
System.out.print("  ");
}
for (int k = 1; k <= 2 * i - 1; k++)
{
if(k==1 || k== 2*i-1 || i==3)
{
	System.out.print(" *");
	}
 else
 {
		 System.out.print("  ");
		 }
		 }
		 System.out.println();
		 }
		}

}

