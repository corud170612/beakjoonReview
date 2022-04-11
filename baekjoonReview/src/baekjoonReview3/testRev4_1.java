package baekjoonReview3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//단계별로 풀어보기 복습
//반복문

//15552번, 빠른 A+B
//문제
//본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
//입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
//java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
//BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
//입력
//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
//다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
//출력
//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

public class testRev4_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write(A+B+"\n");
		}
		bw.flush();
		bw.close();
		
	}

}
