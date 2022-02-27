package DataStructure;

public class CloneArray {
		 
		//1. 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요 
		public static void copy(int[] a, int[] b) {
		System.out.println("복제하기 전 a의 배열");
		for(int num : a) {
			System.out.print(num+" ");
		}
			
		a = new int[b.length];
		a = b.clone();
		System.out.println("\nb의 배열");
		for(int num : b) {
			System.out.print(num+" ");
		}
		System.out.println("\na의 배열");
		for( int num : a) {
			System.out.print(num+" ");
		}
	}
		
	//2. 배열 b의 모든 요소를 배열a 에 역순으로 복사하는 메서드 rcopy를 작성하세요 
	public static void rcopy(int[] a, int[] b) {
		System.out.println("복제하기 전 a의 배열");
		for(int num : a) {
			System.out.print(num+" ");
		}	
		a = new int[b.length];
		a = b.clone();
		int y = a.length-1;
		for(int i=0; i<a.length/2; i++) {
			int temp = a[i];
			a[i] = a[y];
			a[y] = temp;
			y--;
		}
		
		System.out.println("\n역순으로 복제 후 a의 배열");
		for(int num : a) {
			System.out.print(num+" ");
		}
	}
		
		
		
	public static void main(String[] args) {
		int[] b = {1, 2, 3, 4, 5};
		int[] a = {2,3,4}; 
		CloneArray.copy(a, b);
		CloneArray.rcopy(a, b);
	}

}
