package q_060;

import java.util.Scanner;

public class Main {

	// 2개의 정수가 공백을 두고 입력된다.
	// -2147483648 ~ +2147483647
	// 입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
	// 비트단위(bitwise)연산자 &를 사용하면 된다.(and, ampersand, 앰퍼센드라고 읽는다.)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("%d",num1&num2);
		
	}

}
