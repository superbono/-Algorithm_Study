package q_078;

import java.util.Scanner;

public class Main {

	// 정수 1개가 입력된다. (0 ~ 100)
	// 1부터 입력된 수까지 짝수의 합을 출력한다.
	// 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result,sum = 0;
		
		for (int i=0;i<=num;i++) {
			result = i;
			if(result%2 == 0) {
				sum += result;
			}
			if(i==num) {
				System.out.println(sum);
			}
		}
		
		
	}

}
