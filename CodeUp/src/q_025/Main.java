package q_025;

import java.util.Scanner;

public class Main {

	// 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputNum = sc.next();
		int numLength = inputNum.length();
		
		for(int i=0; i<inputNum.length();i++) {
			if(!(inputNum.equals(""))) {
				//System.out.printf("[%s]\n",inputNum.charAt(i));
				int num = Character.getNumericValue(inputNum.charAt(i));
				System.out.printf("[%d]\n",num*(int)Math.pow(10, numLength-(i+1)));
			}
		}
		
	}

}
