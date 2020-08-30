package codeUp100;

import java.util.Scanner;
public class Codeup96 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[20][20];
		int b = scan.nextInt();		
		for(int i=0; i<b; i++) {
			int c = scan.nextInt();
			int d = scan.nextInt();
			a[c-1][d-1] = 1;
		}		
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}		
	}
}
