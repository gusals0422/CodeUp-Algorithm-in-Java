package codeUp100;

import java.util.Scanner;
public class Codeup99 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][]= new int[10][10];
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				a[i][j] = scan.nextInt();
			}
		}	
		int b = 1;
		int c = 1;
		while(true) {
			if(a[1][1]==2) {
				a[1][1]=9;
				break;
			}
			a[1][1]=9;
			if(a[b][c+1]==0) {
				a[b][c+1]=9;
				c++;
			}
			else if(a[b][c+1]==1 && a[b+1][c]==0) {
				a[b+1][c]=9;
				b++;
			}
			else if(a[b][c+1]==2) {
				a[b][c+1]=9;
				break;
			}
			else if(a[b][c+1]==1 && a[b+1][c]==2) {
				a[b+1][c]=9;
				break;
			}
			else if(a[b][c+1]==1 && a[b+1][c]==1) {
				break;
			}
			
		}		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}		
	}
}
