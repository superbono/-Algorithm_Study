package q_076;

import java.util.Scanner;

public class Main {
	
	// 영문자 1개가 입력된다. (a ~ z)
	// a부터 입력한 문자까지 순서대로 공백을 두고 출력한다.
	// 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		for(char i ='a';i<=c;i++) {
			System.out.printf("%s ",i);
		}
		
		
	}

}
