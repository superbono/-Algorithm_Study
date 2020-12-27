package q_066;

import java.util.Scanner;

public class Main {

	// 세 정수 a, b, c 가 공백을 두고 입력된다.
	// 0 <= a, b, c <= +2147483647
	// 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		if(n2%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		if(n3%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
	}

}
