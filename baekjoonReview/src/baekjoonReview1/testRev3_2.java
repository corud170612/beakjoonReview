package baekjoonReview1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//단계별로 풀어보기 복습

//10171번
//문제
//아래 예제와 같이 고양이를 출력하시오.
//출력
//

//BufferWriter 사용
public class testRev3_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\ \n");
		bw.write(" )  ( ') \n");
		bw.write("(  /  ) \n");
		bw.write(" \\(__)| \n");
		
		bw.flush();
		bw.close();
	}

}