package q_049;

import java.util.Scanner;

public class Main {

	// 두 정수(a, b)를 입력받아
	// a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.
	// 어떤 값을 비교하기 위해 비교/관계연산자(comparison/relational)를 사용할 수 있다.
	// 비교/관계연산자 > 는
	// 왼쪽의 값이 오른쪽 값 보다 큰 경우 참(true)을 나타내는 정수값 1로 계산하고,
	// 그 외의 경우에는 거짓(false)를 나타내는 정수값 0으로 계산한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.print(1);
		} else {
			System.out.println(0);
		}
		
	}
	
}
