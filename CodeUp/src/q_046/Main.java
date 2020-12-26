package q_046;

import java.util.Scanner;

public class Main {
	
	// 정수 3개를 입력받아 합과 평균을 출력해보자.
	// 단, -2147483648 ~ +2147483647
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int resultSum = num1 + num2 + num3;
		double resultAvg = (double)(resultSum)/3.0;
		
		// 합
		System.out.println(resultSum);
		// 평균
		System.out.printf("%.1f",resultAvg);
	}

}
