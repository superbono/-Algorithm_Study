package q_074;

import java.util.Scanner;

public class Main {

	// 정수 1개가 입력된다. (1 ~ 100)
	// 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력한다.
	// 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] num = new int[n];
		
		while(n != 0) {
			if(n == 0) {
				break;
			} else {
				System.out.println(n);
				n--;
			}
		}
		
	}

}
