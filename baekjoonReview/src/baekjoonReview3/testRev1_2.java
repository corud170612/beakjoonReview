package baekjoonReview3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//단계별로 풀어보기 복습
//반복문

//2739번, 구구단
//문제
//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
//입력
//첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
//출력
//출력형식과 같게 N*1부터 N*9까지 출력한다.

public class testRev1_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=9; i++) {
			bw.write(n + " * " + i + " = " + (n*i) + "\n");
		}
		bw.flush();
		bw.close();
	}

}