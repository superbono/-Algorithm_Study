package q_040;

import java.util.Scanner;

public class Main {
	
	// 입력된 정수의 부호를 바꿔 출력해보자.
	// 단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.printf("%d",num*-1);
	}

}
