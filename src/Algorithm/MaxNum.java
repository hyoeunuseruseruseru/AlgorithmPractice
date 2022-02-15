package Algorithm;

public class MaxNum {

	// 기본 알고리즘 연습 문제 
	// 문제 1. 네 값의 최댓값을 구하는 max4 메서드를 작성하세요
	static int max4(int a, int b, int c, int d) {
		int max = 0;

		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}

		return max;
	}

	// 문제 2. 세 값의 최솟값을 구하는 min 메서드를 작성하세요
	static int min3(int a, int b, int c) {
		int min = 0;

		min = a;

		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}

	// 문제 3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요
	static int min4(int a, int b, int c, int d) {
		int min = 0;

		min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}

		if (d < min) {
			min = d;
		}
		
		return min;
	}

	public static void main(String[] args) {

		MaxNum max = new MaxNum();
		System.out.println(max.max4(1, 2, 3, 4));
		System.out.println(max.max4(9, 3, 10, 1));
		System.out.println(max.max4(2, 4, 5, 7));

		System.out.println(max.min3(3, 2, 1));
		System.out.println(max.min3(5, 2, 3));
		System.out.println(max.min3(2, -1, 3));
		
		System.out.println(max.min4(1, 2, 3, 4));
		System.out.println(max.min4(4, 3, 2, 1));
		System.out.println(max.min4(5, 4, 3, 2));
		System.out.println(max.min4(5, 4, 3, 7));

	}

}
