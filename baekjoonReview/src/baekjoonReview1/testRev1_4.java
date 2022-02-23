package baekjoonReview1;
//단계별로 풀어보기 복습


//2557번
//문제
//Hello World!를 출력하시오

//StringBuffer 사용
public class testRev1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		//StringBuilder랑 거의 비슷하지만 동기화를 지원한다는 점이 차이가 있음
		//multi-thread 상황에서 문자열이 리소스로 사용된다면 StringBuffer를 사용해줘야함
		//동기화 지원탓에 StringBuilder보단 느리지만 문자열 조작에 있어 String보단 훨씬 빠름
		sb.append("Hello World!");
		
		System.out.println(sb);
	}

}