package codeUp100;

import java.util.Scanner;
public class Codeup89 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		for(int i=1; i<c; i++) {
			a+=b;
		}
		System.out.print(a);
	}
}
