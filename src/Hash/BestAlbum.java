package Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BestAlbum {
	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		ArrayList<Integer> arrAnswer = new ArrayList<Integer>();
		// hmGenres : 장르와 장르 재생 수 
		// 장르 별 재생 수 비교하기 위함 
		HashMap<String, Integer> hmGenres = new HashMap<>();
		
		for (int i = 0; i < genres.length; i++) {
			hmGenres.put(genres[i], hmGenres.getOrDefault(genres[i], 0) + plays[i]);
		}
		
		// keySetList : genre만 담기 
		List<String> keySetList = new ArrayList<>(hmGenres.keySet());
		
		// 재생 수에 따라 인덱스 정렬 ex) classic ,pop 
		Collections.sort(keySetList, (o1, o2) -> (hmGenres.get(o2).compareTo(hmGenres.get(o1))));
		
		
		for (String key : keySetList) {
			// 한 음악의 장르 인덱스와 한 음악의 재생 수 
			HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
			
			//재생 수 에 따라 인덱스 정렬한 keySetList의 배열에 맞춰 인덱스 정렬하고 
			// 음악 재생 수 넣기 . 
			for (int i = 0; i < genres.length; i++) {
				if (key.equals(genres[i])) {
					hs.put(i, plays[i]);
				}
			}
			
			// 한 음악의 장르 인덱스만 가져오기 
			List<Integer> keyLists = new ArrayList<>(hs.keySet());
			
			// 한 음악의 장르 인덱스의 value값에 따라 내림차순 하기 
			keyLists.sort((s1, s2) -> hs.get(s2).compareTo(hs.get(s1)));
			
			// 한 음악의 장르 인덱스 뽑아내기 
			int j = 0;
			for (Integer c : keyLists) {
				if (j > 1) {
					break;
				}
				arrAnswer.add(c);
				j++;
			}
		}
		
		
		// answer 배열에 답 넣기 
		answer = new int[arrAnswer.size()];
		for (int i = 0; i < arrAnswer.size(); i++) {
			answer[i] = arrAnswer.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };

		BestAlbum best = new BestAlbum();
		
		int[] answerArr = best.solution(genres, plays);
		
		for(int answer : answerArr) {
			System.out.println(answer);
		}

	}
}
