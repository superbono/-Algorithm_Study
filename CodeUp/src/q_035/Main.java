package q_035;

import java.util.Scanner;

public class Main {

	// 16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int numFormat = Integer.parseInt(num, 16);
		System.out.printf("%o",numFormat);
	}

}
