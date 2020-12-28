package q_086;

import java.util.Scanner;

public class Main {

	// w, h, b 가 공백을 두고 입력된다.
	// 단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.
	// 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
	// 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		
		float imageFormat  = (float) w*h*b /8/1024/1024;
		
		System.out.printf("%.2f MB",imageFormat);
		
	}

}
