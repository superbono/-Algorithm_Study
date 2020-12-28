package q_082;

import java.util.Scanner;

public class Main {
	
	// 16진수로 한 자리 수가 입력된다. (단, A ~ F 까지만 입력된다.)
	// 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력한다.
	// 계산 결과도 16진수로 출력해야 한다.
	// 16진수(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)를 배운
	// 영일(01)이는 16진수끼리 곱하는 16진수 구구단?에 대해서 궁금해졌다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		int num = Integer.parseInt(c, 16);
		
		for (int i=1; i<16; i++) {
			System.out.printf("%X*%X=%X\n",num,i,num*i);
		}
	}

}
