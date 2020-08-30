package codeUp100;

import java.util.Scanner;
public class Codeup46 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();		
		System.out.println(a+b+c);
		System.out.printf("%.1f",(double)(a+b+c)/3);
	}
}
