package q_065;

import java.util.Scanner;

public class Main {

	// 세 정수 a, b, c 가 공백을 두고 입력된다.
	// 0 ~ +2147483647 범위의 정수들이 입력되며 적어도 1개는 짝수이다.
	// 세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
	// if(조건)
	// { //조건이 참일 때에만 실행되는 구역(코드블록의 시작)
	// 실행1;
	// 실행2;
	// } //코드블록의 끝
	// 짝수만 순서대로 줄을 바꿔 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1%2 == 0) {
			System.out.println(n1);
		} 
		if(n2%2 == 0) {
			System.out.println(n2);
		} 
		if (n3%2 == 0) {
			System.out.println(n3);
		}
		
	}

}
