package codeUp100;

import java.util.Scanner;
public class Codeup20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = a.substring(0, 6);
		String c = a.substring(7);
		System.out.println(b+c);
	}
}
