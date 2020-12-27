package q_069;

import java.util.Scanner;

public class Main {

	// 영문자 1개가 입력된다.
	// (A, B, C, D 등의 한 문자가 입력된다.)
	// 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
	// 평가 : 내용
	// A : best!!!
	// B : good!!
	// C : run!
	// D : slowly~
	// 나머지 문자들 : what?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char eng = sc.next().charAt(0);
		
		switch(eng) {
			case 'A':
				System.out.println("best!!!");
				break;
			case 'B':
				System.out.println("good!!");
				break;
			case 'C':
				System.out.println("run!");
				break;
			case 'D':
				System.out.println("slowly~");
				break;
			default:
				System.out.println("what?");
		}
		
		/*
		if(eng == 'A') {
			System.out.println("best!!!");
		} else if (eng == 'B') {
			System.out.println("good!!");
		} else if (eng == 'C') {
			System.out.println("run!");
		} else if (eng == 'D') {
			System.out.println("slowly~");
		}
		*/
	}

}
