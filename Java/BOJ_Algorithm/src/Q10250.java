//ACM 호텔
//20200120
//mathAlgorithm

import java.util.Scanner;

public class Q10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// 테스트개수

		for (int i = 0; i < t; i++) {// 테스트 개수만큼 반복
			int h = sc.nextInt();// 층 수
			//w는 입력만 받고 따로 사용하지 않음 
			int w = sc.nextInt();// 각 층의 방 수
			int n = sc.nextInt();// 몇번 째 손님인지
			int front, end;
			if (n % h == 0) {//손님 수가 층 수의 배수일 때 
				front = h;//층
				end = n / h;// 호 손님이 걷늘 걸 싫어하기 때문에 최소한 걷는 방법을 찾는거 
			} else {
				front = n % h;
				end = (n / h) + 1; //end가 int형으로 되어있으니 소수자리는 사라진다 
				//n/h가 겹치지만 front에서 달라지기 때문
			}
			
			System.out.println((end<10)?front + "0" + end:front + "" + end);
		}
		sc.close();
	}

}
