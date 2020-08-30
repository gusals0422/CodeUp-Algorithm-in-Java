package codeUp100;

import java.util.Scanner;
public class Codeup74 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i=a; i>0; i--) {
			System.out.println(a);
			a--;
		}
	}
}
