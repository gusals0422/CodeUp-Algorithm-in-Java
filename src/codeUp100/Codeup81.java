package codeUp100;

import java.util.Scanner;
public class Codeup81 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		for(int i =1; i<a+1; i++) {
			for(int j=1; j<b+1; j++) {
				System.out.println(i+" "+j);
			}
		}		
	}
}
