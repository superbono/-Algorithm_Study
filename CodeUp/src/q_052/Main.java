package q_052;

import java.util.Scanner;

public class Main {
	
	// 두 정수(a, b)를 입력받아
	// a와 b가 서로 다르면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 != num2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
	
}
