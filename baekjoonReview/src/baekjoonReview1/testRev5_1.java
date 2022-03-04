package baekjoonReview1;

import java.util.Scanner;

//단계별로 풀어보기 복습

//1000번
//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력
//첫째 줄에 A+B를 출력한다.

//scanner 사용
public class testRev5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
	}

}