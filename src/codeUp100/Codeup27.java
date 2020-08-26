package codeUp100;

import java.util.Scanner;
public class Codeup27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] b = a.split("\\.");
		System.out.println(b[2]+"-"+b[1]+"-"+b[0]);	
	}
}

