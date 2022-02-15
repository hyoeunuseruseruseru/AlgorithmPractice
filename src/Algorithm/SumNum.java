package Algorithm;

public class SumNum {
	
	//문제 1. 실습 1-5 프로그램을 참고하여 n이 7이면 1+2+3+4+5+6+7 =28로 출력하는 프로그램을 작성하세요 
	
	public int sum(int n) {
		int answer = 0;
		
		int sum = 0; 
		for(int i=1; i<=n; i++) {
			sum +=i; 
		}
		answer = sum;
		
		return answer;
	}
	
	//문제 2. 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수합을 구하는 프로그램을 작성하세요
	
	public int gaus(int n) {
		int answer = 0;
		
		int sum = (1+n)*(n/2)+(n%2==0?0:(1+n)/2);
		
		answer = sum;
		return answer;
	}
	
	//문제 3. 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요 
	public int sum(int a, int b) {
		int answer = 0;
		
		
		for(int i=a; i <=b; i++) {
		
			answer +=i;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		SumNum sol = new SumNum();
		
		System.out.println(sol.sum(7));
		
		System.out.println(sol.gaus(7));
	
		System.out.println(sol.sum(3, 5));
	}
	
	

}
