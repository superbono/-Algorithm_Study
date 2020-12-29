package q_088;

import java.util.Scanner;

public class Main {

	// 정수 1개를 입력받는다. (1 ~ 100)
	// 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되
	// 3의 배수는 출력하지 않는다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int n = sc.nextInt();
		
		
		for(i=1;i<=n;i++) {
			if(i%3 == 0) {
				System.out.print("");
			} else {
				System.out.print(i+" ");
			}
		}
		
	}

}
