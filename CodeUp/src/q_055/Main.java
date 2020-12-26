package q_055;

import java.util.Scanner;

public class Main {

	// 두 개의 참(1) 또는 거짓(0)이 입력될 때,
	// 하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 == 1 || num2 == 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
