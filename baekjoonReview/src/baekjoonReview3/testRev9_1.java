package baekjoonReview3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//단계별로 풀어보기 복습
//반복문

//2438번, 별 찍기 - 1
//문제
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//입력
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//출력
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

public class testRev9_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			for(int j=0; j<i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
