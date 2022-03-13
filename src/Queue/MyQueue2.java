package Queue;

import java.util.ArrayList;

public class MyQueue2<T> {
	
	//JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현
	//dequeue 기능 호출 시 큐에 데이터가 없을 경우 null을 리턴
	//다양한 데이터 타입을 다룰 수 있더록 JAVA Generic 타입 문법을 활용해보기 
	
	private ArrayList<T> queue = new ArrayList<T>();
	
	public void enqueue(T item) {
		queue.add(item);
	}
	
	public T dequeue() {
		if(queue.isEmpty()) {
			return null;
		}
		
		//맨 앞의 인덱스에 있는 데이터 삭제
		return queue.remove(0);
	}
	
	public boolean isEmpty() {
		
		return queue.isEmpty();
		
	}
	
	public static void main(String[] args) {
		MyQueue2<Integer> mq = new MyQueue2<Integer>();
		mq.enqueue(1);
		mq.enqueue(2);
		mq.enqueue(3);
		
		System.out.println(mq.dequeue());
	}
	

}
