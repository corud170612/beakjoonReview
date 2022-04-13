package baekjoonReview3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//단계별로 풀어보기 복습
//반복문

//2439번, 별 찍기 - 2
//문제
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//입력
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//출력
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

public class testRev10_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {//N의 숫자에 맞는 줄 설정, 행 정하기
			//공백, 별 둘 다 들어가야함, for문을 두개 설정해줌
			//공백은 한 행에 i(행)의 순번만큼 빼고 들어감
			for(int j=1; j<=N-i; j++) {
				bw.write(" ");
			}
			//별은 i(행)의 순번 만큼 들어감
			for(int k=1; k<=i; k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
