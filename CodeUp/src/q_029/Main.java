package q_029;

import java.util.Scanner;

public class Main {

	// 실수 1개를 입력받아 그대로 출력해보자.
	// (단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		double db = sc.nextDouble();
		String doubleFormat = String.format("%.11f", db);
		System.out.print(doubleFormat);
	}

}
