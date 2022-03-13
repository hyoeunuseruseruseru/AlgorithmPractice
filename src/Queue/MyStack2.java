package Queue;


import java.util.ArrayList;

public class MyStack2<T> {
	
	
	private ArrayList<T> arr = new ArrayList<T>();
	
	public void push(T item) {
		arr.add(item);
		
	}
	
	public T pop() {
		if(arr.isEmpty()) {
			return null;
		}
		
		return arr.remove(arr.size()-1);
	}
	
	public int size() {
		return arr.size();
	}
	
	public void printAll() {
		for(T a : arr) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		MyStack2<Integer> arr = new MyStack2<Integer>();
		arr.push(1);
		arr.push(2);
		arr.push(3);
		arr.push(4);
		arr.push(5);
		
		arr.printAll();
		System.out.println("------------------");
		System.out.println(arr.size());
		System.out.println("------------------");
		arr.pop();
		
		arr.printAll();
	}
	
	
	//Java ArrayList 클래스를 활용해서 스택을 다루는 push pop기능 구혀해보기
	//pop기능 호출 시 스택에 데이터가 없을 경우 null을 리턴하도록 함 
	//다양한 데이터 타입을 다룰 수 있더록, Java Generic 타입 문법을 활용해보기
}
