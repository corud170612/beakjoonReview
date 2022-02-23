package baekjoonReview1;
//단계별로 풀어보기 복습


//2557번
//문제
//Hello World!를 출력하시오

//StringBuilder 사용
public class testRev1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		//BufferedWriter와 유사하게 데이터를 모았다가 한 번에 출력
		//문자열을 조작할 때 매우 유용
		//특징은 StringBuilder에서 문자열을 이어 붙인다는 점
		sb.append("Hello World!");
		
		System.out.println(sb);
	}

}
