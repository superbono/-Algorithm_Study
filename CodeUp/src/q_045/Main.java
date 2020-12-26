package q_045;

import java.util.Scanner;

public class Main {

	// 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
	// 단 0 <= a, b <= 2147483647, b는 0이 아니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int resultSum = num1 + num2;
		int resultMinus = num1 - num2;
		int resultMulti = num1 * num2;
		int resultDiv = num1 / num2;
		int resultRem = num1 % num2;
		double resultDiviVal = (double)num1 / (double)num2;
		
		
		// 합
		System.out.println(resultSum);
		// 차
		System.out.println(resultMinus);
		// 곱
		System.out.println(resultMulti);
		// 몫
		System.out.println(resultDiv);
		// 나머지
		System.out.println(resultRem);
		// 나눈 값
		System.out.printf("%.2f",resultDiviVal);
	}

}
