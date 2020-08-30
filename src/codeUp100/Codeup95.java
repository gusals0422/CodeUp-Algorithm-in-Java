package codeUp100;

import java.util.Scanner;
public class Codeup95 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();		
		int[] b = new int[a];
		for(int i=0; i<a; i++) {
			int c = scan.nextInt();
			b[i]= c;
		}
		int min = b[0];
		
		for(int j=0; j<a; j++) {
			if(b[j]<min) {
				min=b[j];			
			}
		}
		System.out.println(min);
	}
}
