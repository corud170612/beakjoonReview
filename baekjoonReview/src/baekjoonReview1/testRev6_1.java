package baekjoonReview1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//단계별로 풀어보기 복습

//1001번
//문제
//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력
//첫째 줄에 A-B를 출력한다.

//BufferedReader, bufferedWrtier 사용
public class testRev6_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		bw.write(A-B+"");
		bw.flush();
		bw.close();
	}

}