package codeUp100;

import java.util.Scanner;
public class Codeup72 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();		
		int[] b = new int[a];
		for(int i=0; i<b.length; i++) {
			int c = scan.nextInt();
			b[i] = c;
		}
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}		
	}
}
