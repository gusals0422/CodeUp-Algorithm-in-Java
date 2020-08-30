package codeUp100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class Codeup84 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));		
		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++) {
				for(int k=0; k<c; k++) {
					String st= i+" "+j+" "+k;
					bf.write(st+"\n");
				}
			}
		}
		bf.write(Integer.toString(a*b*c));
		bf.close();
	}
}

// 시간제한에 걸려서 BufferedWriter를 사용하였다.