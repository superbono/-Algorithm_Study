package q_094;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	// 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
	// n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
	// 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.
	
	// 10
	// 10 4 2 3 6 6 7 9 8 5
	
	// 5 8 9 7 6 6 3 2 4 10
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i,n,t;
		n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		
		for(i=0;i<n;i++) {
			t = sc.nextInt();
			a.add(t);
		}
		
		Collections.reverse(a);
		
		for(i=0;i<a.size();i++) {
			System.out.printf("%d ",a.get(i));
		}
		
		
	}

}
