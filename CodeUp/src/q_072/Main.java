package q_072;

import java.util.Scanner;

public class Main {

	// 첫 줄에 정수의 개수 n이 입력되고,
	// 두 번째 줄에 n개의 정수가 공백을 두고 입력된다.
	// -2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.
	// n개의 정수가 순서대로 입력된다.
	// -2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.
	// n개의 입력된 정수를 순서대로 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for(int i =0; i<num.length;i++) {
			num[i] = sc.nextInt();
			System.out.println(num[i]);
		}
		
	}

}
