package Hash;

import java.util.HashMap;

public class Report {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = {};
		//신고 당한사람이 k번 신고 당하면 이용 정지 
		//신고 당한사람, 신고 당한 횟수 
		
		
		//신고 한사람
		for(String attacker : report) {
			int division = attacker.indexOf(" ");
			String person = attacker.substring(0,division);
			System.out.println(person);
		}
		//신고 당한사람 
		
		//신고 한사람이 신고 당한사람 여러번 신고하면 1로 처리
		
		
		
		//신고 한사람이 받을 처리 결과 메일 횟수 return 
		return answer;
	}
	
	public static void main (String[] args) {
		Report re = new Report();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		int[] result = re.solution(id_list, report, k);
		for(int answer : result) {
			System.out.println(answer);
		}
	}
}
