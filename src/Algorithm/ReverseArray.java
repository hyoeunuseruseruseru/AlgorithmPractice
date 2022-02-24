package Algorithm;

public class ReverseArray {
	
	public int[] reverse(int[] a) {
		
		int[] reverse = a.clone();
		
		for(int i=0; i< reverse.length/2; i++) {
			System.out.println("a["+i+"] 와 a["+(reverse.length-i-1)+"] 를 교환합니다");
			
			int temp = reverse[i];
			reverse[i] = reverse[reverse.length-i-1];
			reverse[reverse.length-i-1] = temp; 
			
		}
		
		return reverse;
	}
	
	
	public static int sumOf(int[] a) {
		int sum =0;
		
		for(int num : a) {
			sum += num;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		//문제 1. 배열 요소를 역순으로 정렬하기 
		System.out.println("1. 배열 요소를 역순으로 정렬하기");
		int[] a = new int[] {5,10,73,-5,42};
		
		System.out.println("\n------------------------");
		System.out.println("배열 a를 역순으로 정렬하기 전");
		for(int num : a) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("\n------------------------");
		
		ReverseArray solution = new ReverseArray();
		int[] reverse = solution.reverse(a);
		
		System.out.println("\n------------------------");
		System.out.println("요소를 역순으로 정렬한 후");
		for(int num : reverse) {
			System.out.print(num+" ");
		}
		
		//배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요 
		System.out.println("\n-------------------------");
		System.out.println("2. a의 모든 요소의 합계 구하기");
		System.out.println(solution.sumOf(a));
	}
}
