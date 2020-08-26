package codeUp100;

import java.util.Scanner;
public class Codeup23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		String[] b =  String.valueOf(a).split("\\.");
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
