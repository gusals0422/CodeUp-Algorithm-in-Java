package codeUp100;

import java.util.Scanner;
public class Codeup97 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[19][19];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				a[i][j] = scan.nextInt();
			}
		}		
		int b = scan.nextInt();		
		for(int n=0; n<b; n++) {
			int c = scan.nextInt()-1;
			int d = scan.nextInt()-1;
			
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					if(i==c || j==d) {
						if(i==c && j==d) {
							a[i][j] = a[i][j];
						}
						else if(a[i][j]==0) {
							a[i][j]=1;
						}
						else {
							a[i][j]=0;
						}
					}
					
				}
			}		
		}		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
