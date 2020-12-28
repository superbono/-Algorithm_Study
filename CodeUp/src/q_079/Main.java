package q_079;

import java.util.Scanner;

public class Main {

	// 문자들이 1개씩 계속해서 입력된다.
	// 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.
	// 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strSplit = str.split(" ");
		
		for (int i=0;i<strSplit.length;i++) {
			if(strSplit[i].equals("q")) {
				System.out.println('q');
				break;
			}
			System.out.println(strSplit[i]);
		}
		
	}

}
