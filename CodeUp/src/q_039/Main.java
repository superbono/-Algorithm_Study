package q_039;

import java.util.Scanner;

public class Main {
	
	// 정수 2개를 입력받아 합을 출력해보자.
	// 단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		long sumResult = num1 + num2;
		
		System.out.printf("%d",sumResult);
	}

}
