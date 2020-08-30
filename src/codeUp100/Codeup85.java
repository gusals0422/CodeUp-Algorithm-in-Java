package codeUp100;

import java.util.Scanner;
public class Codeup85 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();		
		double result = a*b*c*d;
		result = (result/8)/1024/1024;
		System.out.printf("%.1f MB",result);		
	}
}
