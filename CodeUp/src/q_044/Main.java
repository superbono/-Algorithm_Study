package q_044;

import java.util.Scanner;

public class Main {

	// 정수를 1개 입력받아 1만큼 더해 출력해보자.
	// 단, -2147483648 ~ +2147483647 의 범위로 입력된다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		System.out.printf("%d",num+1);
	}

}
