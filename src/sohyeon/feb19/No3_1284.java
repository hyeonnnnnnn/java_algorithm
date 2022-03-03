package sohyeon.feb19;

import java.util.Scanner;

/*
 * 문제
재석이는 대문에 붙이는 (주소를 나타내는) 호수판 제작업체의 직원이다.

고객에게 전달할 호수판은 숫자와 숫자 사이 그리고 왼쪽 오른쪽으로 적당히 여백이 들어가 줘야하고 숫자마다 차지하는 간격이 조금씩 상이하다. 다행이도 규칙은 매우 간단하다. 

각 숫자 사이에는 1cm의 여백이 들어가야한다.
1은 2cm의 너비를 차지해야한다. 0은 4cm의 너비를 차지해야한다. 나머지 숫자는 모두 3cm의 너비를 차지한다.
호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다.

예를 들어 위의 120 같은 경우,  각 숫자 사이에 여백이 1cm 씩 2개 들어간다. 1은 2cm, 2는 3cm, 0은 4cm를 차지한다. 오른쪽, 왼쪽 경계에서 각각 여백이 1cm씩 차지한다.
따라서 총 2 + 2 + 3 + 4 + 1 + 1 = 13(cm) 가 된다.

재석이는 고객에게 전달해야할 호수판의 너비가 얼마나 되는지 궁금해졌다. 재석이를 도와주자!
--
호수판에 들어갈 숫자 N의 범위는 1 ≤ N ≤ 9999 이다.

입력은 마지막에 0이 들어오기 전까지 계속해서 줄 단위로 주어진다.

또한, 마지막의 0은 처리하지 않는다.
--
각 입력마다 얼마만큼 너비를 차지하는지 정수로 출력하면 된다.

각 출력은 줄바꿈으로 구분되어야한다.
--
예제 입력 1 
120
5611
100
0
예제 출력 1 
13
15
14
 
 */
public class No3_1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();			// 수 입력받기

			if(str.equals("0")) break;			// 0 입력받을 경우 종료. 문자열 비교는 .equals
			
			int sum = 0;	// 총 길이 초기화
			
			for (int i = 0; i < str.length(); i++) {

				char c = str.charAt(i);			// i번째 글자 가져와서

				if (c == '1') {					// 입력받은 글자 1일 경우: 길이 2cm
					sum = sum + 2;
				} else if (c == '0') {			// 입력받은 글자 0일 경우: 길이 4cm
					sum = sum + 4;
				} else {						 // 나머지: 길이 3cm
					sum = sum + 3;
				}

			}
			sum = sum + str.length() - 1 + 2;		// 총 글자 길이 + 글자 사이 간격 + 여백(2)
			
			sc.close();
			
			System.out.println(sum);
		}

	}
}
