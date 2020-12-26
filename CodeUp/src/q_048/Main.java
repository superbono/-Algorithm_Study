package q_048;

import java.util.Scanner;

public class Main {
	
	// 정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
	// 0 <= a <= 10, 0 <= b <= 10
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pow = sc.nextInt();
		System.out.printf("%d",num << pow);
	}

}
