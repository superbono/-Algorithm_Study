package q_067;

import java.util.Scanner;

public class Main {

	// 정수 1개가 입력된다.
	// -2147483648 ~ +2147483647, 단 0은 입력되지 않는다.
	// 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("plus");
			if(num%2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else {
			System.out.println("minus");
			if(num%2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}

}
