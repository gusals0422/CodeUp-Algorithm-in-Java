package codeUp100;

import java.util.Scanner;
public class Codeup90 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		for(int i=1; i<c; i++) {
			a*=b;
		}
		System.out.print(a);
	}
}
