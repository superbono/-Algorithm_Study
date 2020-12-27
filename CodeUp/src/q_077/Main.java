package q_077;

import java.util.Scanner;

public class Main {

	// 정수 1개가 입력된다. (0 ~ 100)
	// 0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.
	// 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}
		
		
	}

}
