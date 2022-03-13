package DataStructure;

import java.util.Scanner;

public class CardConvRev2 {
	// 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요
	static int sol(int x, int r, char[] d) {
		int digits = 0; 
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			System.out.println(r+"|      "+x);
			System.out.println(" +----------"+"..."+(x%r));
			d[digits++] = dchar.charAt(x % r);
			x /=r;
		}while(x!=0);
		if(x==0) {
			System.out.println("	"+x+"   ..."+(x%r));
		}
		
		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수를 기수 변환 합니다.");
		
		int x; //정수  
		int r; //진수 
		char[] d = new char[32]; //기수 변환 후에 배열에 담기
		do {
		System.out.print("변환하는 음이 아닌 정수 : ");
		x = sc.nextInt();
		}while(x<=0);
		
		do {
		System.out.print("\n어떤 진수로 변환 할까요?(2-36) : ");
		r = sc.nextInt();
		}while(r<2||r>36);
		
		
		int digits = CardConvRev2.sol(x, r, d);
		
		System.out.print("\n"+r+"진수로 ");
		for(int i = digits; i>=0; i--) {
			System.out.print(d[i]);
		}
		System.out.println("입니다");
	}

}
