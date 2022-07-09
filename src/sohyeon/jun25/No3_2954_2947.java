package sohyeon.jun25;

import java.util.Scanner;
// 2954가 없어서 2947 풀었다..!

/*
 * 문제
동혁이는 나무 조각을 5개 가지고 있다. 나무 조각에는 1부터 5까지 숫자 중 하나가 쓰여져 있다. 또, 모든 숫자는 다섯 조각 중 하나에만 쓰여 있다.

동혁이는 나무 조각을 다음과 같은 과정을 거쳐서 1, 2, 3, 4, 5 순서로 만들려고 한다.

첫 번째 조각의 수가 두 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
두 번째 조각의 수가 세 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
세 번째 조각의 수가 네 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
네 번째 조각의 수가 다섯 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
만약 순서가 1, 2, 3, 4, 5 순서가 아니라면 1 단계로 다시 간다.
처음 조각의 순서가 주어졌을 때, 위치를 바꿀 때 마다 조각의 순서를 출력하는 프로그램을 작성하시오.
--
입력
첫째 줄에 조각에 쓰여 있는 수가 순서대로 주어진다. 숫자는 1보다 크거나 같고, 5보다 작거나 같으며, 중복되지 않는다. 처음 순서는 1, 2, 3, 4, 5가 아니다.
--
출력
두 조각의 순서가 바뀔때 마다 조각의 순서를 출력한다.
--
예제 입력 1 
2 1 5 3 4
예제 출력 1 
1 2 5 3 4
1 2 3 5 4
1 2 3 4 5
--
예제 입력 2 
2 3 4 5 1
예제 출력 2 
2 3 4 1 5
2 3 1 4 5
2 1 3 4 5
1 2 3 4 5
*/

public class No3_2954_2947 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] iArr = new int[5];
		int tmp = 0;

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = sc.nextInt();
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr.length - 1; j++) {

				if (iArr[j] > iArr[j + 1]) {											 // 앞에 위치한 수가 더 클 때 버블정렬 해줌

					tmp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = tmp;
					
					for(int num:iArr) {
						System.out.print(num+" ");										// 정렬 한 회 마다 출력
					}
					System.out.println();
				}
			}
		}
		
		sc.close();

	}
}
