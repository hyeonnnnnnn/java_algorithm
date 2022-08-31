package mijin.std_mijin.y_2022.sep_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*준살 프로그래밍 대회 다국어
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	315	211	189	67.021%
문제
준규는 해빈이의 위대함을 전세계에 알리기위해서 프로그래밍 대회를 개최하려고 한다. 대회를 준비하던 중, 잠시 페이스북에서 Poke에 집중하느라 참가 신청을 구현하지 못했다.

대회에 참가하는 사람들은 모두 아이디와 비밀번호를  이용해 시스템에 로그인해야 한다. 참가 신청을 구현하지 않았기 때문에, 모든 사람들의 아이디는 "userN" 형식이다. 비밀번호는 사람들이 추측할 수 없게 만들어야 한다. 추측하거나 패턴이 뻔한 경우에는 대회 도중에 다른 사람의 아이디로 로그인을 할 수 있기 때문이다.

비밀번호를 랜덤을 이용해 만들면, 입력하기가 약간 어려울 수 있다. 따라서, 사전에서 단어 N개를 찾아 화면에 띄운 다음, 입력해야 하는 단어 순서를 알려주는 방식을 사용하기로 했다.

단어의 목록과 각 참가자의 순서가 주어졌을 때, 모든 사람의 비밀번호를 구하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있고, 첫째 줄에 테스트 케이스의 개수가 주어진다.

각 테스트 케이스의 첫째 줄에는 단어의 개수 1 ≤ m ≤ 50이 주어진다. 다음 m개 줄에는 단어가 한 줄에 하나씩 주어진다. 각 단어의 길이는 최대 5글자이고, 공백을 포함하지 않는다. 다음 줄에는 참가자의 수 1 ≤ n ≤ 200이 주어지며, 다음 n개 줄에는 각 참가자의 비밀번호 정보가 주어진다. 

비밀번호 정보는 정수 1 ≤ k ≤ 10 로 시작하며, 비밀번호를 이루고 있는 단어의 개수이다. 다음 k개 숫자는 단어의 인덱스를 나타내며, 순서대로 해당하는 단어를 연결한 문자열이 비밀번호이다.

출력
각 테스트 케이스마다 첫째 줄에는 "Scenario #i:"를 출력하고, 다음 줄부터 순서대로 각 참가자의 비밀번호를 출력한다.

테스트 케이스 사이에 빈 줄을 출력한다.

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
arrrrrrrrr*/
public class bj_7513 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int casen =Integer.parseInt( br.readLine());
		int m ;
		int n;
		int k;
		for(int c=1;c<=casen;c++) {
			System.out.println("Scenario #"+c+":");
			
			m=Integer.parseInt( br.readLine());//단어수
			String wordlist [] = new String [m];
			for(int i=0;i<m;i++) {
				wordlist[i]=br.readLine();
			}
			
			n=Integer.parseInt( br.readLine());//인원수
			for(int i=0;i<n;i++) {
				st= new StringTokenizer(br.readLine());
				k=Integer.parseInt(st.nextToken()); //단어수
				
				for(int t=0;t<k;t++) {
					System.out.print( wordlist[ Integer.parseInt(st.nextToken()) ] );
				}
				System.out.println();
			}
		}
		
	}

}
