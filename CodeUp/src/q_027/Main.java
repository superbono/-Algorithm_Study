package q_027;

import java.util.Scanner;

public class Main {

	// 년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.
	// 년월일(yyyy.mm.dd)를 입력받아,
	// 일월년(dd-mm-yyyy)로 출력해보자.
	// (단, 한 자리 일/월은 0을 붙여 두자리로, 년도도 0을 붙여 네자리로 출력한다.) 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String personal = sc.next();
		String[] arr = personal.split("\\.");
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		System.out.printf("%02d-%02d-%04d",day,month,year);
	}

}
