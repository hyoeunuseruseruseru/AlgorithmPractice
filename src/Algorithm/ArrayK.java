package Algorithm;

import java.util.Arrays;

public class ArrayK {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int x = commands[i][0];// 2
			int y = commands[i][1];// 5
			int z = commands[i][2];// 3

			int[] array2 = new int[y - (x - 1)];// 5-(2-1)=4
			int arr = x - 1;// 1
			for (int j = 0; j < array2.length; j++) { // index 1~ index
				array2[j] = array[arr];
				arr++;
			}
			Arrays.sort(array2);

			answer[i] = array2[z - 1];
		}
		return answer;
	}

	public int[] solution2(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		ArrayK sol = new ArrayK();
		int[] answer = sol.solution(array, commands);
		System.out.print("답 : ");
		for (int num : answer) {
			System.out.print(num + " ");
		}

	}

}
