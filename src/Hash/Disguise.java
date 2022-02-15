package Hash;

import java.util.HashMap;
import java.util.Iterator;

public class Disguise {

	public int solution(String[][] clothes) {
		// 1. 옷을 종류별로 구분하기
		HashMap<String, Integer> map = new HashMap<>();
		//의상의 대분류, 의상 종류의 갯수 
		
		System.out.println("----------다차원 배열 연습용--------------------------------");
		//다차원 배열 연습용 
		for(int i =0; i<clothes.length; i++) {
			System.out.println("clothes.length = "+clothes.length);
			for(int j=0; j<clothes[i].length; j++) {
				System.out.println("clothes[i].length = "+clothes[i].length);
				System.out.println("clothes[i][j] = "+clothes[i][j]);
			}
		}
		System.out.println("--------------------------------------------------------");
		
		
		for (String[] cloth : clothes) {
			String type = cloth[1];
			System.out.println("cloth[1][0], type = "+type);
			map.put(type, map.getOrDefault(type, 0) + 1);
		}
		
		
		// 2. 입지 않는 경우를 추가하여 모든 조합 계산하기 
		// 의상 종류의 갯수 값만 가져오기 
		Iterator<Integer> it = map.values().iterator();
		int answer = 1;
		while (it.hasNext())
			answer *= it.next().intValue() + 1;
		// +1 하는 이유는
		// +1 : eyewear를 착용하면서 headgear를 착용하지 않거나 
		// +1 : headgear를 착용하면서 eyewear를 착용하지 않는 경우 
		
		
		// 3. 아무종류의 옷도 입지 않는 경우 제외하기
		return answer - 1;

	}
	
	public static void main(String[] args) {
		String[][] clothes = {
				{"yellowhat","headgear"},
				{"green_turbanz","headgear"},
				{"bluesunglasses","eyewear"}
		};
		
		Disguise disguise = new Disguise();
		System.out.println(disguise.solution(clothes));
	}
	
	

}
