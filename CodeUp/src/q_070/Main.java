package q_070;

import java.util.Scanner;

public class Main {

	// 월을 의미하는 1개의 정수가 입력된다.(1 ~ 12)
	// 계절 이름을 출력한다.
	// 월 : 계절 이름
	// 12, 1, 2 : winter
	// 3, 4, 5 : spring
	// 6, 7, 8 : summer
	// 9, 10, 11 : fall
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seasonNum = sc.nextInt();
		
		switch(seasonNum) {
			case 12:
			case 1:
			case 2:
				System.out.println("winter");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("fall");
				break;
		}
		
	}

}
