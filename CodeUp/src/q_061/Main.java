package q_061;

import java.util.Scanner;

public class Main {

	// 2개의 정수가 공백을 두고 입력된다.
	// -2147483648 ~ +2147483647
	// 입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
	// 비트단위(bitwise) 연산자 |(or, vertical bar, 버티컬바)를 사용하면 된다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("%d",num1|num2);
	}

}
