package q_057;

import java.util.Scanner;

public class Main {

	// 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
	// 두 개의 참(1) 또는 거짓(0)이 입력될 때,
	// 참/거짓이 서로 같을 때에만 참이 계산되는 프로그램을 작성해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if((num1 == 1 && num2 == 1)||(num1 == 0 && num2 ==0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
