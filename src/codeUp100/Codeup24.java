package codeUp100;

import java.util.Scanner;
public class Codeup24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] b = a.split("");
		for(int i=0; i<b.length; i++) {
			System.out.println("'"+b[i]+"'");
		}
	}
}
