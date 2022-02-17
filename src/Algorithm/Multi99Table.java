package Algorithm;

public class Multi99Table {
	
	
	public static void main(String[] args) {
		//1. 곱셈표를 출력하는 프로그램 작성
		System.out.println("문제 1 \n");
		for(int i =1; i<=9; i++) {
			if(i==1) {
				System.out.print( " |");
				for(int j=1; j<=9; j++) {
					System.out.print( i*j+" ");
				}
				
				System.out.println();
				System.out.println("---+--------------------");
			}
			System.out.print(i + "|");
			for(int k=1; k<=9; k++) {
				
				System.out.print( i*k+" ");
			}
			System.out.println();
		}
		
		//문제 2. 
		System.out.println("\n-------------------");
		System.out.println("문제 2. 사각형을 출력합니다");
		System.out.println("단  수 : 5 ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
