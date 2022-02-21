package Algorithm;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =0;
		do {
			System.out.println("몇 단 삼각형 입니까?");
			n= sc.nextInt();
		}while(n<=0);
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		System.out.println("---------------");
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		System.out.println("-------------");
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
