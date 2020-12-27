package q_068;

import java.util.Scanner;

public class Main {

	// 정수(0 ~ 100) 1개가 입력된다.
	// 평가 결과를 출력한다.
	// 점수 범위 : 평가
	// 90 ~ 100 : A
	// 70 ~ 89 : B
	// 40 ~ 69 : C
	// 0 ~  39 : D
	// 로 평가되어야 한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score >= 0 && score <= 100) {
			if(score <= 100 && score >= 90) {
				System.out.println("A");
			} else if (score < 90 && score >= 70) {
				System.out.println("B");
			} else if (score < 70 && score >= 40) {
				System.out.println("C");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("범위를 넘어갔습니다.");
		}
		
	}

}
