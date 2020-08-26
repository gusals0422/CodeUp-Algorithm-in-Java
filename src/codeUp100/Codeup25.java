package codeUp100;

import java.util.Scanner;
public class Codeup25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String[] b = String.valueOf(a).split("");
		int[] c = new int[b.length];
		for(int i=0; i<b.length; i++) {
			c[i] = Integer.parseInt(b[i]);
		}
		System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]",c[0]*10000,c[1]*1000,c[2]*100,c[3]*10,c[4]);
	}
}
