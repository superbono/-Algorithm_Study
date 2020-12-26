package q_038;

import java.util.Scanner;

public class Main {

	// 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
	// (단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int plus = sc.nextInt();
		int minus = sc.nextInt();
		long result = (long)plus + (long)minus;
		
		System.out.printf("%d",result);
	}

}
