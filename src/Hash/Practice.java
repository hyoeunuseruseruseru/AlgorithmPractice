package Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice {
	//맞춘 갯수에 따라 등수 매기기 
	//맞춘 갯수 : 			 0,1,2,3,4,5,6
	static int[] rank = {6,6,5,4,3,2,1};
	
	  public int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = {};
	        
	        //알아 볼 수 없는 숫자의 수 
	        int zero = 0; 
	        //맞춘 갯수 
	        int corr = 0; 
	        
	        for(int i=0; i<6; i++) {
	        	
	        	//알아 볼 수 없는 숫자의 갯수 
	        	if(lottos[i]==0) {
	        		zero++;
	        	}
	        	
	        	// 맞춘 갯수
	        	for(int j=0; j<6; j++) {
	        		if(lottos[i]==win_nums[j]) {
	        			corr++;
	        		}
	        	}
	        }
	        
	        answer = new int[2];
	        
	        //최저 등수
	        answer[0] = rank[corr];
	        //최고 등수 
	        answer[1] = rank[corr+zero];
	        
	       
	        return answer;
	  }
	
	public static void main(String[] args) {
		Practice prac = new Practice();

		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int[] answer = prac.solution(lottos, win_nums);
		
		for(int rank : answer) {
			System.out.println(rank);
		}
	}
}
