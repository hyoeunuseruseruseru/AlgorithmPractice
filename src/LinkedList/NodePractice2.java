package LinkedList;

public class NodePractice2 {

	
	
	public static void main(String[] args) {
		//Node와 Node 연결하기 : Node 인스턴스간 연결 
		NodePractice<Integer> node1 = new NodePractice<Integer>(1);
		NodePractice<Integer> node2 = new NodePractice<Integer>(2);
		
		
		node1.next = node2;
		NodePractice head = node1;
	
	}

}
