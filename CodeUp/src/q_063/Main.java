package q_063;

import java.util.Scanner;

public class Main {

	// 두 정수가 공백을 두고 입력된다.
	// -2147483648 ~ +2147483647
	// 입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
	// 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 > num2 ? num1 : num2);
	}

}
