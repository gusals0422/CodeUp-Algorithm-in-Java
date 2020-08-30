package codeUp100;

import java.util.Scanner;
public class Codeup78 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = 0;
		for(int i=0; i<a+1; i++) {			
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
