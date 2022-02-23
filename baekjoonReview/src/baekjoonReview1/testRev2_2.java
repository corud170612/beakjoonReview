package baekjoonReview1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//단계별로 풀어보기 복습


//10718번
//문제
//대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.
//출력
//두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.

//BufferedWriter 사용
public class testRev2_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("강한친구 대한육군");
		bw.newLine();//\n과 같은 역할
		bw.write("강한친구 대한육군");
		
		bw.flush();
		bw.close();
	}

}