package baekjoonReview1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//단계별로 풀어보기 복습

//18108번
//문제
//ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다.
//공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
//불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다.
//반면, 우리나라는 서기 연도를 사용하고 있다.
//불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
//입력
//서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
//출력
//불기 연도를 서기 연도로 변환한 결과를 출력한다.

//BufferedReader, bufferedWrtier 사용
public class testRev11_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int y = Integer.parseInt(br.readLine());
		
		bw.write((y-543)+"");
		bw.flush();
		bw.close();
	}

}