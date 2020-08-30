package codeUp100;

import java.util.Scanner;
public class Codeup91 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();
		for(int i=1; i<d; i++) {
			a=a*b+c;
		}
		System.out.print(a);
	}
}
