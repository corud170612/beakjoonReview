package baekjoonReview1;

import java.util.Scanner;

//단계별로 풀어보기 복습

//1008번
//문제
//두 자연수 A와 B가 주어진다.
//이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
//입력
//첫째 줄에 A와 B가 주어진다. (1 < A, B < 10,000)
//출력
//첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

//scanner 사용하기
public class testRev9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
	}

}