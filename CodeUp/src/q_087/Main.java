package q_087;

import java.util.Scanner;

public class Main {

	// 언제까지 합을 계산할 지, 정수 1개를 입력받는다.
	// 단, 입력되는 자연수는 100,000,000이하이다.
	// 1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우, 그때까지의 합을 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int sum = 0;
		int n = sc.nextInt();
		
		while(true) {
			for(i=1;i<=n;i++) {
				sum += i;
				if(sum>=n) {
					System.out.println(sum);
					break;
				}
			}
			break;
		}
		
	}

}
