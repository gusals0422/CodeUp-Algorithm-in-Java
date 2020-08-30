package codeUp100;

import java.util.Scanner;
public class Codeup94 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] b = new int[a+1];
		for(int i=0; i<a; i++) {
			int c = scan.nextInt();
			b[i]= c;
		}
		for(int j=a-1; j>=0; j--) {
			System.out.println(b[j]);
		}
	}
}
