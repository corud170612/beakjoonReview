package baekjoonReview3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//단계별로 풀어보기 복습
//반복문

//10871번, X보다 작은 수
//문제
//정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//입력
//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
//주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//출력
//X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

public class testRev11_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());		
		int a[] = new int[n];
		//배열 선언과 동시에 배열 크기 할당
		//주로 배열의 값은 모르지만 향후 값을 저장하기 위해 사용
		st = new StringTokenizer(br.readLine(), " ");
		//배열에 입력받은 수열 다 저장하기
		for(int i=0; i<a.length; i++) {
		//배열은 배열의 길이를 가지는 상수 멤버변수인 length를 가짐
		//배열 인덱스는 0부터 시작
			a[i] = Integer.parseInt(st.nextToken());
		}
		//다시 한 번 반복문으로 배열을 검사하여 조건문에 따라 출력
		for(int i=0; i<a.length; i++) {
			if(a[i]<x) {
				bw.write(a[i]+ " ");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
