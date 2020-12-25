package q_019;

import java.util.Scanner;

public class Main {

	// 년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
        String[] arr = a.split("\\.");
        int year = Integer.valueOf(arr[0]);
        int month = Integer.valueOf(arr[1]);
        int day = Integer.valueOf(arr[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day);
	}

}
