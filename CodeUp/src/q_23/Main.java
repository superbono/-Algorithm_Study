package q_23;

import java.util.Scanner;

public class Main {

	// 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputNum = sc.nextLine();
		String arr[] = inputNum.split("\\.");
		int num = Integer.valueOf(arr[0]);
		int decimal = Integer.valueOf(arr[1]);
		System.out.printf("%s\n",num);
		System.out.printf("%s\n",decimal);
	}

}
