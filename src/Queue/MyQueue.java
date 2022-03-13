package Queue;

import java.util.Queue;
import java.util.LinkedList;


public class MyQueue {
	public static void main(String[] args) {
		//큐 구조
		//1. 줄을 서는 행위와 유사 
		//FIFO 또는 LILO 방식으로 스택과 순서가 반대 
		
		// 자료형 매개변수를 넣어서 큐에 들어갈 데이터의 타입을 지정해야 함 
		Queue<Integer> arr = new LinkedList<Integer>();
		
		// 데이터 추가 방법 
		arr.offer(2);
		arr.add(3);
		arr.add(4);
		
		//Queue 인스턴스를 출력하면 해당 큐에 들어 있는 아이템 리스트가 출력됨 
		System.out.println(arr);
		
		//poll()은 큐의 첫 번째 값 반환, 해당 값은 큐에서 삭제 
		arr.poll();
		System.out.println(arr);
		
		// JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현
		//dequeue 기능 호출 시 큐에 데이터가 없을 경우 null을 리턴
		//다양한 데이터 타입을 다룰 수 있더록 JAVA Generic 타입 문법을 활용해보기 
		
		
	}

}
