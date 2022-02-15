package Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Marathon {

	public String solution(String[] participant, String[] completion) {
		
		String answer = "";
		
		//1. 참가자(String)와 완주 여부(Integer)를 Map에 담기 위해 새 객체 생성  
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//2. Map 안에 참가자 CountTable 생성 
		for(String player : participant) {
			map.put(player, map.getOrDefault(player,0)+1);
			// map안에 'player'키를 넣고, 
			// - map.getOrDefault : 
			//   1) 만약에 player의 Value값이 이미 존재 한다면
			//      기존 player Value값 + 1
			//   2) 존재하지 않으면 
			//      Default 값 + 1
			// 
		}
		
		//3. 완주자의 경우에는 value가 0이 되게 만든다. 
		for(String player : completion) {
			map.put(player, map.get(player)-1);
			// map.get(key) : key의 value를 가져온다. 
		}
		
		//4. map 안에 전체 key, value를 주입해준다. 
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			//미완주자를 찾아내기 위해 iter 안에 있는 key, value를 하나씩 가져온다. 
			Map.Entry<String, Integer> entry = iter.next();
			
			if(entry.getValue()!=0) {
				answer = entry.getKey();
				break;
				
			}
			
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		String[] part = {"leo", "kiki", "eden" };
		String[] comp = {"kiki", "eden" };
		Marathon mar = new Marathon();
		System.out.println(mar.solution(part, comp));
		
		
	
		


	}

}
