package sohyeon.aug27;

import java.util.Scanner;

/*문제
준규는 해빈이의 위대함을 전세계에 알리기위해서 프로그래밍 대회를 개최하려고 한다. 대회를 준비하던 중, 잠시 페이스북에서 Poke에 집중하느라 참가 신청을 구현하지 못했다.

대회에 참가하는 사람들은 모두 아이디와 비밀번호를 이용해 시스템에 로그인해야 한다. 참가 신청을 구현하지 않았기 때문에, 모든 사람들의 아이디는 "userN" 형식이다. 

비밀번호는 사람들이 추측할 수 없게 만들어야 한다. 추측하거나 패턴이 뻔한 경우에는 대회 도중에 다른 사람의 아이디로 로그인을 할 수 있기 때문이다.

비밀번호를 랜덤을 이용해 만들면, 입력하기가 약간 어려울 수 있다. 따라서, 사전에서 단어 N개를 찾아 화면에 띄운 다음, 입력해야 하는 단어 순서를 알려주는 방식을 사용하기로 했다.

단어의 목록과 각 참가자의 순서가 주어졌을 때, 모든 사람의 비밀번호를 구하는 프로그램을 작성하시오.
--
입력
입력은 여러 개의 테스트 케이스로 이루어져 있고, 첫째 줄에 테스트 케이스의 개수가 주어진다.

각 테스트 케이스의 첫째 줄에는 단어의 개수 1 ≤ m ≤ 50이 주어진다. 다음 m개 줄에는 단어가 한 줄에 하나씩 주어진다. 

각 단어의 길이는 최대 5글자이고, 공백을 포함하지 않는다. 다음 줄에는 참가자의 수 1 ≤ n ≤ 200이 주어지며, 다음 n개 줄에는 각 참가자의 비밀번호 정보가 주어진다. 

비밀번호 정보는 정수 1 ≤ k ≤ 10 로 시작하며, 비밀번호를 이루고 있는 단어의 개수이다. 다음 k개 숫자는 단어의 인덱스를 나타내며, 순서대로 해당하는 단어를 연결한 문자열이 비밀번호이다.
--
출력
각 테스트 케이스마다 첫째 줄에는 "Scenario #i:"를 출력하고, 다음 줄부터 순서대로 각 참가자의 비밀번호를 출력한다.

테스트 케이스 사이에 빈 줄을 출력한다.
--
예제 입력 1 
2
4
an
bar
doh
mu
2
4 0 0 0 0
2 3 1
2
a
r
1
10 0 1 1 1 1 1 1 1 1 1
예제 출력 1 
Scenario #1:
anananan
mubar

Scenario #2:
arrrrrrrrr
*/
public class No3_7513 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();															// 테스트케이스 개수
		sc.nextLine();
		
		for(int i = 0; i < T; i++) {													// 테스트케이스 개수 만큼 수행
			int m = sc.nextInt();														// 단어 개수
			sc.nextLine();
			
			String[] str = new String[m];												// 비밀번호 단어
			
			for(int j = 0; j < m; j++) {
				str[j] = sc.nextLine();													// 비밀번호 단어 저장
				
			}
			
			int n = sc.nextInt();														// 참가자 수
			
			for(int v = 0; v < n; v++) {												// 참가자 수 만큼 수행
				int k = sc.nextInt();													// 비밀번호 단어 개수
				
				for(int c = 0; c < k; c++) {											// 비밀번호 단어 배열 위치(l)에 해당하는 단어 수 k번 반복 append
					int l = sc.nextInt();
//					System.out.println(str[l]);
					sb.append(str[l]);
				}
				sb.append("\n");														// 참가자 구분을 위해 개행문자 별도 append
			}
			
			System.out.println("Scenario #" + (i+1) + ":");
			System.out.print(sb);
			sb.setLength(0);															// stringbuilder 초기화
		}
		
		sc.close();
	}

}
