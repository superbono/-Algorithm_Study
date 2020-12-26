package q_034;

import java.util.Scanner;

public class Main {

	// 8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int numFormat = Integer.parseInt(num,8);
		System.out.printf("%d",numFormat);
	}

}
