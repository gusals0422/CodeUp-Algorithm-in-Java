package codeUp100;

import java.util.Scanner;
public class Codeup19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String[] arr = a.split("\\.");
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}		
		System.out.printf("%04d.%02d.%02d",arr2[0],arr2[1],arr2[2]);
	}
}
