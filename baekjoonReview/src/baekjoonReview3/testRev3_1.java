package baekjoonReview3;

import java.util.Scanner;

//단계별로 풀어보기 복습
//반복문

//8393번, 합
//문제
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//입력
//첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//출력
//1부터 n까지 합을 출력한다.

public class testRev3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum +=i;
			//+= 왼쪽 변수에 더하면서 대입
			//num = num + i 와 같은 뜻
		}
		System.out.println(sum);
	}

}
