package etc;

public class Lotto {
	
	//1. 등수 배열 ex) 6개 맞으면 rank[6] "1"등
	                   //0,1,2,3,4,5,6
	static int rank[] = {6,6,5,4,3,2,1};
	
	 public int[] solution(int[] lottos, int[] win_nums) {
		 int[] answer = {};
		 
		 //0 갯수
		 int zero = 0; 
		 
		 //로또 당첨번호랑 맞는 갯수
		 int corr = 0;
		 
		 
		 //로또 번호가 6개 이니까 6까지.
		 for(int i=0; i<6; i++) {
			 
			 if(lottos[i]==0) {
				 zero++;
			 }
			 for(int j=0; j<6; j++) {
				 if(lottos[i]==win_nums[j]) {
					 corr++;
				 }
			 }
			 
			 answer = new int[2];
			 //최저 등수
			 answer[1] = rank[corr];
			 
			 //최고 등수 
			 answer[0] = rank[corr+zero];
			 
		 }
		 return answer;
	 }

}
