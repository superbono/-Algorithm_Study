package q_092;

import java.util.Scanner;

public class Main {

	// 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.
	// 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는, 방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.)
	// 온라인 채점시스템에는 초등학생, 중고등학생, 대학생, 대학원생, 일반인, 군인, 프로그래머, 탑코더 등 아주 많은 사람들이 들어와 문제를 풀고 있는데,
	// 실시간 채점 정보는 메뉴의 채점기록(Judge Status)을 통해 살펴볼 수 있다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int day = 1;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		while(day%a !=0 || day%b !=0 || day%c !=0) {
            day++;
        }
		
		System.out.println(day);
	}

}
