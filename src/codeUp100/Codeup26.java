package codeUp100;

import java.util.Scanner;
public class Codeup26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] b = a.split(":");
		if(b[1].equals("00")) {
			System.out.println("0");
		}
		else {
		System.out.println(b[1]);
		}
	}
}
