package codeUp100;

import java.util.Scanner;
public class Codeup64 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println((a<b?a:b)<c?(a<b?a:b):c);
	}
}
