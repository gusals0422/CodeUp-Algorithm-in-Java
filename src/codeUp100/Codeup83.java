package codeUp100;

import java.util.Scanner;
public class Codeup83 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i=1; i<a+1; i++) {
			if(i%3==0) {
				System.out.print("X"+" ");
			}
			else {
				System.out.print(i+" ");
			}
		}
	}
}
