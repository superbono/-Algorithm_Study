package q_014;

import java.util.Scanner;

public class Main {

	// 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch1 = sc.next();
		String ch2 = sc.next();
		System.out.printf("%s %s",ch2,ch1);
	}

}
