package baekjoonReview2;

import java.util.Scanner;

//단계별로 풀어보기 복습
//if문

//2753번
//문제
//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
//1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//입력
//첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//출력
//첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

public class testRev3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int Y = sc.nextInt();
		
		if(Y%4 == 0) {
			if(Y%400 == 0) System.out.println("1");
			else if(Y%100 == 0) System.out.println("0");
			else System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
	}

}
