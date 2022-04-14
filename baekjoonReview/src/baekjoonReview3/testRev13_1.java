package baekjoonReview3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//단계별로 풀어보기 복습
//반복문

//10951번, A+B-4
//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력
//각 테스트 케이스마다 A+B를 출력한다.

public class testRev13_1 {
//더이상 읽을 수 있는 데이터(EOF)가 없을 때 종료, ctrl + z입력으로 EOF던져주기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while((input = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(input, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a+b+"\n");
			
		}
		bw.write(sb + " ");
		bw.flush();
		bw.close();
		
	}

}
