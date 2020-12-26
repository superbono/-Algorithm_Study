package q_026;

import java.util.Scanner;

public class Main {

	// 입력되는 시:분:초 에서 분만 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		String[] arr = time.split(":");
		
		int h = Integer.valueOf(arr[0]);
		int m = Integer.valueOf(arr[1]);
		int s = Integer.valueOf(arr[2]);
		
		System.out.printf("%d",m);
	}

}
