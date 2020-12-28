package q_083;

import java.util.Scanner;

public class Main {

	// 10 보다 작은 정수 1개가 입력된다. (1 ~ 9)
	// 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
	// 3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.
	// 3 6 9 게임을 하던 영일이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
	// 3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			if(i%3 == 0) {
				System.out.print("X ");
			} else {
				System.out.print(i+" ");
			}
		}
		
	}

}
