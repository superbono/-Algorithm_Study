package q_093;

import java.util.Scanner;

public class Main {

	// 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
	// 두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.
	// 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n,i,t;
		
		n = sc.nextInt();
		int[] a = new int [24];
		
		
		for(i=1;i<=n;i++) {
			//System.out.printf("%d ",a[t]);
			t = sc.nextInt();
			a[t] += 1;
		}
		
		
		for(i=1;i<a.length;i++) {
			//a[i] = 0;
			System.out.printf("%d ",a[i]);
		}
		
		
	}

}
