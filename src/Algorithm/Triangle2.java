package Algorithm;

public class Triangle2 {
	public static void main(String[] args) {
		// 오른쪽 아래가 직각인 이등변 삼각형을 출력
		int n = 5;
		for (int i = 1; i <= n; i++) { // 1~5까지
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		// 오른쪽 위가 직각인 이등변 삼각형을 출력 
		for(int i =n; i>0; i--) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		//n단의 피라미드를 출력하는 메서드 작성 
		//i 행에는 (i-1)*2+1개의 기호 문자 *가 출력되게 하세요(마지막 n행에는 (n-1)*2+1개의 기호문자
		// *를 출력하게 됩니다.)
		
		for(int i=0; i<n; i++) {
			for(int k=n-i; k>0; k--) {
				System.out.print(" ");
			}
			for(int j=0; j< (i-1)*2+1; j++) {
				System.out.print("냐");
			}
			System.out.println();
		}
		
		// n단의 숫자 피라미드를 출력하는 메서드를 작성하세요 
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<(i-1)*2+1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
