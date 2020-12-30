package q_091;

import java.util.Scanner;

public class Main {

	// 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가
	// 공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)
	// n번째 수를 출력한다.
	// 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.
	// 예를 들어
	// 1 -1 3 -5 11 -21 43 ... 은
	// 1부터 시작해 이전에 만든 수에 -2를 곱한 다음 1을 더해 다음 수를 만든 수열이다.
	
	// 1 -2 1 8 -> -85
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,m,d,n;
		int cnt = 1;
		a = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		n = sc.nextInt();
		long cal = a * m + d;
		
		if(n == 1) {
			System.out.println(a);
		} else {
			for (int i=2; i<n; i++) {
				cal = cal * m + d;
			}
			System.out.println(cal);
		}
	}

}
