package codeUp100;

import java.util.Scanner;
public class Codeup93 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] b = new int[24];
		for(int i=1; i<=a; i++) {
			int c = scan.nextInt();
			b[c] += 1;
		}
		for(int j=1; j<=23; j++) {
			System.out.print(b[j]+" ");
		}
	}
}
