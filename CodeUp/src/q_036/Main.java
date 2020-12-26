package q_036;

import java.util.Scanner;

public class Main {

	// 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String engStr = sc.next();
		
		for(int i=0;i<engStr.length();i++) {
			char engChar = engStr.charAt(i);
			System.out.println((int)engChar);
		}
	}

}
