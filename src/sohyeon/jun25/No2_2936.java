package sohyeon.jun25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-2936-%EC%B1%84%EC%8B%9D%EC%A3%BC%EC%9D%98%EC%9E%90-boj-java
/*
 * 문제
상범이는 저번 주말에 수영장을 만들었다.

수영장은 직각 이등변 삼각형이고, 두 변의 길이가 250이다.

사실 상범이가 수영장을 만든 이유는 파티였다. 파티에는 많은 여학생들이 왔고, DJ도 왔다. 또, 고기는 매우 맛있게 구워지고 있었다.

하지만, 그들이 예상하지 못한 문제가 생겼다. 이 파티에 놀러왔던 친구들 중에 준민이는 채식주의자였기 때문에 고기를 먹지 않는다.

반면에, 고기가 없는 파티는 파티라고 생각하지 않는다. 따라서, 상범이는 수영장을 두 부분으로 나누기로 했다.

수영장은 위에 그림에서 보이듯이 좌표 평면 위에 있다. 그리고, 두 끝점이 삼각형의 변 위에 있는 선분을 이용해서 두 구역으로 나눌 것이다. 두 구역은 넓이가 같아야 한다.

삼각형을 이등분하는 선분의 한 끝점이 주어진다. 이때, 다른 한 끝점을 구하는 프로그램을 작성하시오.
--
입력
첫째 줄에 선분의 한 끝점이 주어진다. 이 점은 항상 삼각형의 변 위에 있다.
--
출력
첫째 줄에 다른 끝점을 소수점 둘째 자리까지 출력한다. 이때, 셋째 자리에서 반올림하면 된다.
--
예제 입력 1 
0 0
예제 출력 1 
125.00 125.00
--
예제 입력 2 
230 20
예제 출력 2 
0.00 114.13
--
예제 입력 3 
0 40
예제 출력 3 
148.81 101.19
*/
public class No2_2936 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());											// 행 좌표
		int b = Integer.parseInt(st.nextToken());											// 열 좌표
		
		// [A]
		if (a + b == 0) {
			System.out.println("125.00 125.00");
			return;
		}
		double base = 250.0 * 250.0 / 2;

		// [B]
		if (a > 0 && b > 0) {
			System.out.println(String.format(a > b ? "0.00 %.2f" : "%.2f 0.00", 250.0 - base / Math.max(a, b)));
			return;
		}

		// [C]
		if (a < 125 && b == 0) {
			double tmp = 250.0 - base / (250 - a);
			System.out.println(String.format("%.2f %.2f", tmp, 250.0 - tmp));
			return;
		}

		// [D]
		if (a == 0 && b < 125) {
			double tmp = 250.0 - base / (250 - b);
			System.out.println(String.format("%.2f %.2f", 250.0 - tmp, tmp));
			return;
		}

		// [E]
		if (b == 0) {
			System.out.println(String.format("0.00 %.2f", base / a));
			return;
		}

		// [F]
		System.out.println(String.format("%.2f 0.00", base / b));
	}

}
