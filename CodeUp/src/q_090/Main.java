package q_090;

import java.util.Scanner;

public class Main {

	
	// 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 10)
	// n번째 수를 출력한다.
	// 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.
	// 예를 들어
	// 2 6 18 54 162 486 ... 은
	// 2부터 시작해 이전에 만든 수에 3을 곱해 다음 수를 만든 수열이다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a;
		int r,n;
		
		int cnt = 1;
		a = sc.nextLong();
		r = sc.nextInt();
		n = sc.nextInt();
		
		while(a >= 0) {
			cnt ++;
			a *= r;
			if(n == cnt) {
				break;
			}
		}
		
		System.out.println(a);
		
	}

}
