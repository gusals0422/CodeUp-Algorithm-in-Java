package codeUp100;

import java.util.Scanner;
public class Codeup68 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();		
		if(90<=a && a<=100) {
			System.out.println("A");
		}
		else if(70<=a && a<=89) {
			System.out.println("B");
		}
		else if(40<=a && a<=69) {
			System.out.println("C");
		}
		else if(0<=a && a<=39) {
			System.out.println("D");
		}
	}
}
