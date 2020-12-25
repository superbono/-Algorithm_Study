package q_020;

import java.util.Scanner;

public class Main {

	// 주민번호는 다음과 같이 구성된다.
	// XXXXXX-XXXXXXX
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regNum = sc.next();
		String arr[] = regNum.split("-");
		int frontNum = Integer.valueOf(arr[0]);
		int backNum = Integer.valueOf(arr[1]);
		
		System.out.printf("%06d%07d",frontNum,backNum);
	}

}
