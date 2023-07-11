package com.training.kodnest;

import java.util.Scanner;

public class SecretMessageDecoder {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	char c=scan.next().charAt(0);
	MessageDecoder decoder = new MessageDecoder();
    scan.close();
	
	System.out.println(decoder.decodeCharacter(c));
}
}
