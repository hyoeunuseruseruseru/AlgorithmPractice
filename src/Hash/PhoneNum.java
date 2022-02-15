package Hash;

import java.util.HashMap;
import java.util.Map;

public class PhoneNum {
	    public boolean solution(String[] phone_book) {
	    	/*
			 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다. 전화번호가 다음과 같을 경우, 구조대
			 * 전화번호는 영석이의 전화번호의 접두사입니다.
			 * 
			 * 구조대 : 119 박준영 : 97 674 223 지영석 : 11 9552 4421 전화번호부에 적힌 전화번호를 담은 배열
			 * phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지
			 * 않으면 true를 return 하도록 solution 함수를 작성해주세요.
			 * 
			 * 제한 사항 phone_book의 길이는 1 이상 1,000,000 이하입니다. 각 전화번호의 길이는 1 이상 20 이하입니다. 같은
			 * 전화번호가 중복해서 들어있지 않습니다.
			 */
			
			// 1. HashMap을 선언한다. 
			Map<String, Integer> map = new HashMap<>(); 
			// 2. 모든 전화번호를 HashMap에 넣는다. 
			for (int i = 0; i < phone_book.length; i++) {
				map.put(phone_book[i], i); 
			}
				
			// 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다. 
			for (int i = 0; i < phone_book.length; i++) {
				System.out.println("phone_book.length(배열의 크기) : "+phone_book.length);
				System.out.println("phone_book[i](Key) : "+phone_book[i]);
				for (int j = 0; j < phone_book[i].length(); j++) {
					System.out.println("phone_book[i].length()(Key의 길이) : "+phone_book[i].length());
					System.out.println("j : "+j);
					System.out.println("phone_book[i].substring(0, j)(Key의 접두어) : "+phone_book[i].substring(0, j));
					if (map.containsKey(phone_book[i].substring(0, j))){
						System.out.println("false");
						return false; 
					}
					System.out.println("-----------");
				}
			}
					
			return true;

	    }
	
	public static void main(String[] args) {
		String[] phone_book = {"123","456","789"};
		
		PhoneNum num = new PhoneNum();
		System.out.println(num.solution(phone_book));
	}

}
