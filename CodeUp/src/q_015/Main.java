package q_015;

import java.util.Scanner;

public class Main {

	
	// 실수(float) 1개를 입력받아 저장한 후,
	// 저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여
	// 소수점 이하 둘 째 자리까지 출력하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f1 = sc.nextFloat();
		System.out.printf("%.2f",f1);
	}

}
