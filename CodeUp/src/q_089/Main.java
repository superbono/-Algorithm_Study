package q_089;

import java.util.Scanner;

public class Main {

	// 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가
	// 공백을 두고 입력된다.(모두 0 ~ 100)
	// n번째 수를 출력한다.
	// 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열(series)이라고 한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,d,n;
		int cnt = 1;
		a = sc.nextInt();
		d = sc.nextInt();
		n = sc.nextInt();
		
		while(a>0) {
			cnt ++;
			a += d;
			if (cnt == n) {
				break;
			}
			
		}
		System.out.println(a);

	}

}
