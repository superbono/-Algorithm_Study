package q_084;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	// 빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.
	// 예를 들어, 3 3 3 은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지의 색이 있음을 의미한다.
	// 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
	// 줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] rgb = br.readLine().split(" ");
		int r = Integer.parseInt(rgb[0]);
		int g = Integer.parseInt(rgb[1]);
		int b = Integer.parseInt(rgb[2]);
		int cnt = 0;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i=0;i<r;i++) {
			for (int j=0;j<g;j++) {
				for (int k=0;k<b;k++) {
					cnt++;
					bw.write(i+" "+j+" "+k+"\n");
				}
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
	}

}
