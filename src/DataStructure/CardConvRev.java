package DataStructure;

public class CardConvRev {

	static int sol(int x, int r, char[] d) {

		int digits = 0; // 변환 후의 자릿 수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		return digits;
	}

	static int sol2(int x, int r, char[] d) {
		int digits = 0; // 변환 후의 자릿 수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		int y = d.length-1;
		for (int i = 0; i < d.length / 2; i++) {
			char temp = d[i];
			d[i] = d[y];
			d[y] = temp;
			y--;
		}
		

		return digits;
	}

	public static void main(String[] args) {
		int x = 59;
		int r = 8;
		char[] d = new char[32];

		int digits = CardConvRev.sol(x, r, d);

		System.out.println("자릿수는 " + digits + " 입니다.");

		System.out.print(x + "를 " + r + "진수로 변환하면 : ");
		for (int i=0; i<digits; i++) {

			System.out.print(d[i]);
		}
		System.out.print("입니다.");

		System.out.println("\n2. 배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드를 작성하세요.");
		digits = CardConvRev.sol2(x, r, d);

		System.out.println("자릿수는 " + digits + " 입니다.");

		System.out.print(x + "를 " + r + "진수로 변환하면 : ");
		for (int i=d.length-digits; i<d.length; i++) {

			System.out.print(d[i]);
		}
		System.out.print("입니다.");
	}

}
