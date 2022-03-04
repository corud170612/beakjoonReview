package baekjoonReview1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//단계별로 풀어보기 복습

//1008번
//문제
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력
//첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

//BufferedReader, bufferedWrtier 사용
public class testRev8_1 {
//주의할 점
//입력이 공백 단위로 주어진다.
//출력 조건은 상대오차 또는 절대오차 범위 이하여야 한다.
//오차 범위를 벗어나지 않게 하기 위해 반드시
//double형으로 출력해주어야 한다.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		
		bw.write(A/B+"");
		bw.flush();
		bw.close();
	}

}