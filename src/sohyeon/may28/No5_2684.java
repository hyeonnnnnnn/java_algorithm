package sohyeon.may28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 문제
동전게임은 주로 두 사람이 함께 즐기는 게임이다. 이 중 3-동전게임은 여러 명이 할 수 있는 게임이다. 각 사람은 각각 3-동전수열 중 하나를 선택한다.

3-동전수열이란 앞 뒤 앞과 같은 수열이고, 8가지(뒤뒤뒤,뒤뒤앞,뒤앞뒤,뒤앞앞,앞뒤뒤,앞뒤앞,앞앞뒤,앞앞앞)가 있다.

이제 심판은 동전 1개를 40번 던진다. 그 다음 심판은 동전이 앞인지 뒤인지를 던진 순서대로 종이에 적는다. 그 다음 3-동전수열이 각각 몇 번씩 나왔는지 기록한다.

가장 많이 나온 수열을 선택한 사람이 이긴다.

동전 40번 던진 결과가 주어졌을 때, 3-동전수열이 각각 몇 번 나왔는지를 출력하는 프로그램을 작성하시오. 예를 들어, 40개의 동전이 모두 앞면일 경우 앞앞앞은 38번 나타난다.
--
입력
첫째 줄에 테스트 케이스의 개수 P(1 ≤ P ≤ 1000)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 동전을 40번 던진 결과가 주어진다. 이때, 앞면은 H로, 뒷면은 T로 표현한다. 
--
출력
각 테스트 케이스마다 3-동전수열이 몇 번 나타났는지를 출력한다. 뒤뒤뒤, 뒤뒤앞, 뒤앞뒤, 뒤앞앞, 앞뒤뒤, 앞뒤앞, 앞앞뒤, 앞앞앞 순서대로 공백으로 구분해서 출력한다.
--
예제 입력 1 
4
HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
HHTTTHHTTTHTHHTHHTTHTTTHHHTHTTHTTHTTTHTH
HTHTHHHTHHHTHTHHHHTTTHTTTTTHHTTTTHTHHHHT
예제 출력 1 
0 0 0 0 0 0 0 38
38 0 0 0 0 0 0 0
4 7 6 4 7 4 5 1
6 3 4 5 3 6 5 6
*/
public class No5_2684 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine());

//		String[] comp = { "HHH", "HHT", "HTH", "HTT", "THH", "THT", "TTH", "TTT" };
		String str = "";
		int[][] cnt = new int[P][8];
		String[][] arr = new String[P][38];
		
		for (int i = 0; i < P; i++) {
			str = br.readLine();																		 // 한 줄씩 읽어와서
			for (int j = 0; j < str.length() - 2; j++) {
				String s = "" + str.charAt(j) + str.charAt(j + 1) + str.charAt(j + 2);					 // 문자 3개씩 끊어서
				arr[i][j] = s;																			 // str 배열에 넣음
				
//				System.out.print(arr[i][j] + " ");
				
				switch (arr[i][j]) {																	// 해당 동전수열과 일치할 경우 ++
					case "TTT": cnt[i][0]++; break;
					case "TTH": cnt[i][1]++; break;
					case "THT": cnt[i][2]++; break;
					case "THH": cnt[i][3]++; break;
					case "HTT": cnt[i][4]++; break;
					case "HTH": cnt[i][5]++; break;
					case "HHT": cnt[i][6]++; break;
					case "HHH": cnt[i][7]++; break;
				}
			}
		}
		
		for(int i = 0; i < P; i++) {
			for(int j = 0 ; j < 8; j++) {
				System.out.print(cnt[i][j]+" ");														// 결과
				
			}
			System.out.println();
		}

	}

}
