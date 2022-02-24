package Algorithm;

import java.util.Random;
public class MaxOfArrayRand {
	
	public static int maxOf(int a[]) {
		
		int max = a[0];
		for(int num : a) {
			if(num > max) {
				max = num;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		//1. 최댓값 구하기 
		Random rand = new Random();
		int num;
		System.out.println("키의 최댓값을 구합니다");
		System.out.print("사람 수 : ");
		do {
		num = rand.nextInt(10);
		}while( num <=1);
		System.out.print(num);
		
		int[] height = new int[num];
		
		//2. 배열에 난수 값 넣기 
		for(int i =0; i< height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
		}
		
		System.out.print("\n배열 : ");
		for(int person : height) {
			System.out.print(person+" ");
		}
		
		System.out.print("\n가장 큰 사람 : ");
		MaxOfArrayRand sol = new MaxOfArrayRand();
		System.out.println(+sol.maxOf(height));
		
		
	}

}
