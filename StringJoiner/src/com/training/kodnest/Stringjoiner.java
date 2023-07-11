package com.training.kodnest;

public class Stringjoiner {
	public static void main(String[] args) {
		
		String res=joinStrings("Hello",",World!");
		System.out.println(res);
		
	}


public static String joinStrings(String s1, String s2)
{
	return s1+s2;
}
}
