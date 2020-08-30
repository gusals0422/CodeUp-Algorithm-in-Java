package codeUp100;

import java.util.Scanner;
public class Codeup88 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i=1; i<=a; i++) {
			if(i%3==0) {
				System.out.print("");
			}
			else {
				System.out.print(i+" ");
			}
		}
	}
}
