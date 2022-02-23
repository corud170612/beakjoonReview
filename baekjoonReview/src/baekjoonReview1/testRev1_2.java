package baekjoonReview1;
//단계별로 풀어보기 복습

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//2557번
//문제
//Hello World!를 출력하시오

//BufferedWriter 사용
public class testRev1_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//buffer에 있는 IO클래스인데 데이터를 하나씩 읽어오는 것이 아닌
		//임시공간(버퍼)에 저장해두었다가 한 번에 출력 또는 데이터를 보내는 방식
		bw.write("Hello World!");
		
		bw.flush();
		bw.close();
	}

}
