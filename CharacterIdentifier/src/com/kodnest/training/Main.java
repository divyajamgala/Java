package com.kodnest.training;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the character:");
	char c=scan.next().charAt(0);
	identifyCharacter(c);
	scan.close();
}

public static void identifyCharacter(char ch)

{
if(Character.isDigit(ch))
{
	System.out.println("Entered character "+ch+" Is Digit....");
}
else if(!Character.isLetter(ch))
{
	System.out.println("Entered character "+ch+" Is special character");
}
else
{
	switch(Character.toLowerCase(ch))
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		if(Character.isLowerCase(ch))
		{
			System.out.println("Entered character "+ch+" is lower case vowel.");
		}
		else
		{
			System.out.println("Entered character "+ch+" is upper case vowel");
		}
		break;
	default:
		if(Character.isLowerCase(ch))
		{
			System.out.println("Entered character "+ch+" is lower case consonant");
		}
		else
		{
			System.out.println("Entered character "+ch+" is upper case consonant");
		}
			
	}
}


}


}
