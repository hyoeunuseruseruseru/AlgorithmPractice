package etc;

public class RecommandId {
	 public String solution(String new_id) {
	        String answer = "";
	        //1. 모든 대문자를 대응되는 소문자로 치환
	        answer = new_id.toLowerCase();
	        //2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), * 마침표(.)를 제외한 모든 문자를 제거합니다
	        answer = answer.replaceAll("[^-_.a-z0-9]", "");
	        //3. 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
	        answer = answer.replaceAll("[.]{2,}", ".");
	        //4. 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
	        answer = answer.replaceAll("^[.]|[.]$", "");
	        //5. 빈 문자열이라면, "a"를 대입
	        if(answer.equals("")) {
	        	answer +="a";
	        }
	        //6. 길이가 16자 이상이면 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거 
	        if(answer.length()>=16) {
	        	answer = answer.substring(0, 15);
	        	answer = answer.replace("^[.]|[.]$", "");
	        }
	        //7. 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙인다. 
	        if(answer.length()<=2) {
	        	String lastChar = answer.substring(answer.length());
	        	while(answer.length()==3) {
	        		answer +=answer.charAt(answer.length()-1);
	        	}
	        }
	        
			/*
			 * 치환합니다. 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다. 5단계 new_id가 빈 문자열이라면,
			 * new_id에 "a"를 대입합니다. 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을
			 * 모두 제거합니다. 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다. 7단계
			 * new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
			 */
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		 String new_id = "...!@BaT#*..y.abcdefghijklm";
		 System.out.println("치환 전 : "+new_id);
		 
		 RecommandId sol = new RecommandId();
		 String answer = sol.solution(new_id);
		 System.out.println("치환 후 : "+answer);
	 }
}
