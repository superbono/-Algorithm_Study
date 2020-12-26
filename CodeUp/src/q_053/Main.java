package q_053;

import java.util.Scanner;

public class Main {

	// 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
	// 반대로 출력하는 프로그램을 작성해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println(0);
		} else if (num == 0) {
			System.out.println(1);
		} else {
			System.out.println(num);
		}
		 
	}

}
