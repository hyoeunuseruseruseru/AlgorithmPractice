package Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SolutionSort {
	  public int solution(String[][] clothes) {
	        int answer = 0;
	        answer = 1; //곱하기 해야하니까
	        //1. 의상 대분류, 의상의 갯수 담기 
	        HashMap<String, Integer> map = new HashMap<String, Integer>();
	        
	        for(String[] cloth : clothes) {
	        	String type = cloth[1];
	        	map.put(type, map.getOrDefault(type, 0)+1);
	        	//Key 안에 type의 Value가 있으면 기존 value+1
	        	//없으면 디폴트값 0 
	        }
	        
	        //2 의상의 갯수 값만 가져오기 
	        Iterator<Integer> iter = map.values().iterator();
	        while(iter.hasNext()) {
	        	answer *= iter.next().intValue()+1;
	        }
	        
	      
	       
	        
	        return answer-1;
	    }

	public static void main(String[] args) {
		String[][] clothes = {
				{"yellowhat","headgear"},
				{"green_turbanz","headgear"},
				{"bluesunglasses","eyewear"}
		};
		
		SolutionSort sol = new SolutionSort();
		System.out.println(sol.solution(clothes));
	}

}
