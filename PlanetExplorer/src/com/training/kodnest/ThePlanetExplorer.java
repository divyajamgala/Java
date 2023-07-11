package com.training.kodnest;
import java.util.Scanner;
public class ThePlanetExplorer {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double radius=scan.nextDouble();
	PlanetExplorer explorer = new PlanetExplorer();
    System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
    scan.close();
}
}
