package Algorithm;

import java.util.Scanner;
//2022-02-16

public class Game {
	public static void main(String[] args) {

		// 문제 1. 오른쪽과 같이 두 변수 a,b에 정수를 입력하고 b-1를 출력하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		/*
		 * int a; int b;
		 * 
		 * do { System.out.print("a의 값 : "); a = sc.nextInt();
		 * System.out.print("b의 값 : "); b = sc.nextInt(); }while(a > b); //a가 b 이하일 때까지
		 * 반복
		 * 
		 * 
		 * int result = b-a;
		 * 
		 * System.out.println("b-a의 값은 "+result+"입니다.");
		 */

		while (true) {
			System.out.println("==========시작===========");
			System.out.println("효은 : 안녕 재용아 너는 뭐행? ");
			System.out.println("========================");
			System.out.println("번호를 선택하세요");
			System.out.println("1. 쉬는 중\n2. 밥먹는 중\n3. 핸드폰 보는 중\n4. 기묘은 생각중 " + "\n5. 말하고 싶지 않아\n6. 기타..");
			System.out.println("========================");
			String choice = "";
			String reply = "";
			int answer = sc.nextInt();

			switch (answer) {
			case 1:
				choice = "쉬는 중";
				reply = "오홍 쉬는 중 이구낭";
				break;
			case 2:
				choice = "밥먹는 중";
				reply = "오호 밥먹는 중 이구낭";
				break;
			case 3:
				choice = "핸드폰 보는 중";
				reply = "아하 핸드폰 보는 중이구낭";
				break;
			case 4:
				choice = "효디 생각 중 ><";
				reply = "아하 내 생각 중이구나!";
				break;
			case 5:
				choice = "대화하고싶지 않아";
				reply = "나랑 말하고 싶지 않구낭 ㅜ 알겠어..\n(상처받은 효은...)";
				break;
			case 6:
				String etc = "";
				System.out.println(" 효은 : 그러면 뭐하는 중인데?");
				do {
					etc = sc.nextLine();
				} while (etc.equals(""));
				System.out.println("재용 : " + etc);
				System.out.println("효은 : " + etc + "이구낭..");
				break;
			default:
				choice = "다른 번호를 선택할래";
				reply = "다른 선택지는 없어!";
				break;
			}
			if (answer != 6) {
				System.out.println("재용 : " + choice);
				System.out.println("효은의 답변 : " + reply);
				System.out.println("========================");
			}
			if (answer == 5 ) {
				System.out.println("효디와의 대화 종료..");
				break;
			}
		}

	}

}
