package q_085;

import java.util.Scanner;

public class Main {

	// h, b, c, s 가 공백을 두고 입력된다.
	// h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
	// 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
	// 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.
	// 소리가 컴퓨터에 저장될 때에는 디지털 데이터화 되어 저장된다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();
		
		float wave = (float)h*b*c*s/8/ 1024/1024;
		
		System.out.printf("%.1f MB",wave);
		
	}

}
