package Algorithm;

import java.util.Scanner;

//문제. 자릿수를 출력하는 프로그램을 작성.
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력하세요");
		int n;
		do {
			n = sc.nextInt();
		}while(n <= 0);
		
		String result = Integer.toString(n);
		System.out.println(result+"는 "+result.length()+"자리 입니다.");
	}
}
