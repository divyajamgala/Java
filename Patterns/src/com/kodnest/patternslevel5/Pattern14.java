package com.kodnest.patternslevel5;

public class Pattern14 {
public static void main(String[] args) {
      for (int i = 5; i >= 1; i--)
      {
    	  for (int j = i; j < 5; j++) {
	                System.out.print(" ");
	            }
	         for (int k = 1; k <= (2 * i - 1); k++)
	         {
	          if (k == 1 || i == 5 || k == (2 * i - 1))
	          {
	                    System.out.print("*");
	                }
	          else {
	                    System.out.print(" ");
	                }
	            }
	  
	            System.out.println("");
	        }
	    }
	  }

