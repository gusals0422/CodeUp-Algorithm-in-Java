package codeUp100;

import java.util.Scanner;
public class Codeup98 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c[][] = new int[a][b];		
		int d = scan.nextInt();
		for(int i=0; i<d; i++) {
			int e = scan.nextInt();
			int f = scan.nextInt();
			int g = scan.nextInt()-1;
			int h = scan.nextInt()-1;			
			for(int j=0; j<e; j++) {
				if(f==1) {
					c[g+j][h]=1;
				}
				if(f==0) {
					c[g][h+j]=1;
				}
			}			
		}		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}		
	}
}
