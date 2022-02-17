package Algorithm;

import java.util.Scanner;
//2022-02-16

public class SumForPos {
	public static void main(String[] args) {

		// 문제 1. 오른쪽과 같이 두 변수 a,b에 정수를 입력하고 b-1를 출력하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		
		  int a; int b;
		  
		  do { System.out.print("a의 값 : "); a = sc.nextInt();
		  System.out.print("b의 값 : "); b = sc.nextInt(); }while(a > b); 
		  
		  int result = b-a;
		  
		  System.out.println("b-a의 값은 "+result+"입니다.");
		 

	

	}

}
