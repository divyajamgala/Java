package com.kodnest.patternslevel5;

public class Pattern4 {
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
		 System.out.print("* ");
		 }
		 else {
		 System.out.print("  ");
		 }
		 }
	System.out.println();
}
		 for (int i = 1; i <= 5; i++) 
		 {
		 	    for (int j = 1; j <= 5; j++)
		 	    {
		 	        if ((i == 1 || i == 5 || j == 1 || j == 5)) 
		 	                {
		 	                    System.out.print("* "); 
		 	                } 
		 	                else {
		 	                    System.out.print("  "); 
		 	                }
		 	            }
		 	            System.out.println(); 
		 	        }
}

}

