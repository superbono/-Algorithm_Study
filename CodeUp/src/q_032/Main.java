package q_032;

import java.util.Scanner;

public class Main {

	// 10진수를 입력받아 16진수(hexadecimal)로 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.printf("%h",num);
	}

}
