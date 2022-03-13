package Queue;

import java.util.Stack;

public class MyStack {


	public static void main(String[] args) {
		Stack<Integer> arr = new Stack<Integer>();
		
		arr.push(1);
		arr.push(2);
		arr.push(3);
		arr.push(4);
		
		
		System.out.println(arr);
		
		arr.pop();
		
		System.out.println(arr);
		
		
	}
}
