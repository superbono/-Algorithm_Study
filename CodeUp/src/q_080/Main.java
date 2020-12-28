package q_080;

import java.util.Scanner;

public class Main {

	// 정수 1개가 입력된다.
	// 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
	// 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.
	// 1, 2, 3 ... 을 계속 더해 나갈 때,
	// 그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
	// 계속 더하는 프로그램을 작성해보자.
	// 즉, 1부터 n까지 정수를 계속 더한다고 할 때,
	// 어디까지 더해야 입력한 수보다 같거나 커지는지 알아보고자 하는 문제이다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		int num = sc.nextInt();
		
		
		if(num >=0 && num <= 1000) {
			
			while(num > sum) {
				cnt++;
				sum += cnt;
			}
			System.out.println(cnt);
		}
		
	}

}