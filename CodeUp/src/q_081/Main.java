package q_081;

import java.util.Scanner;

public class Main {

	// 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
	// 단, n, m은 10이하의 자연수
	// 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
	// 첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.
	
	// 1부터 n까지, 1부터 m까지 숫자가 적힌
	// 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=m;j++) {
				System.out.printf("%d %d\n",i,j);
			}
		}
		
	}

}
