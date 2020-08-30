package codeUp100;

import java.util.Scanner;
public class Codeup87 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = 0;
		int i=1;
		while(true) {		
			sum+=i;
			i++;
			if(sum>=a) {
				System.out.println(sum);
				break;
			}				
		}
	}
}
