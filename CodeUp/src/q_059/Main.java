package q_059;

import java.util.Scanner;

public class Main {

	// 정수 1개가 입력된다.
	// -2147483648 ~ +2147483647
	// 입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
	// 비트단위(bitwise)연산자 ~ 를 붙이면 된다.(~ : tilde, 틸드라고 읽는다.)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.printf("%d",~num);
	}

}
