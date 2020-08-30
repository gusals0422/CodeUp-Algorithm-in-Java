package codeUp100;

import java.util.Scanner;
public class Codeup76 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a = scan.next().charAt(0);
		for(int i=0; i<26-('z'-a); i++) {
			System.out.printf("%c",'a'+i);
			System.out.print(" ");
		}	
	}
}
