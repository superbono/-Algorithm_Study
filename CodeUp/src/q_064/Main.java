package q_064;

import java.util.Scanner;

public class Main {

	// 3개의 정수가 공백으로 구분되어 입력된다.
	// -2147483648 ~ +2147483648
	// 입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
	// 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.println((n1>n2?n2:n1)>n3?n3:(n1>n2?n2:n1));
	}

}
