package sohyeon.july23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 문제
꿍은 만사가 귀찮아서 말을 하기도 귀찮아 한다. 그래서 하려는 말을 대신해줄 줄임말을 만들려고 하는데 나름 규칙을 만들었다.

하려는 말은 최소 하나 이상의 단어를 포함하는데 각 단어들은 정확히 한칸의 공백으로 구분이 된다. 

줄임말을 만들때는 각 단어의 앞글자를 따서 만들어지는데 다음의 단어들은 쓸모없는 단어들이므로 무시한다.

'i', 'pa', 'te', 'ni', 'niti', 'a', 'ali', 'nego', 'no', 'ili'.

하지만 이 단어들이 하려는 말의 맨 앞에 올경우 매우 중요하다고 판단되어 무시하면 안되고 줄임말에 포함하여야 한다.

줄임말을 만들기도 귀찮아진 꿍을 위해 줄임말을 만들어주는 프로그램을 작성하라.

단, 줄임말은 모두 대문자로만 이루어져있다.
--
입력
입력은 유일하게 한 줄만 주어지며 하려는 말이 포함되어 있다.

문장은 알파벳 소문자와 공백으로만 이루어져 있다.

문장의 최대길이는 100이다.
--
출력
만들어진 줄임말을 출력하라.
--
예제 입력 1 
micro soft
예제 출력 1 
MS
--
예제 입력 2 
biti ali i ne biti
예제 출력 2 
BNB
--
예제 입력 3 
ali ja sam i jucer jeo
예제 출력 3 
AJSJJ
*/
public class No1_3181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		sb.append(st.nextToken().toUpperCase().charAt(0));							// 첫 글자만 대문자로 바꿈
		
		while(st.hasMoreTokens()) {
			String str = st.nextToken();											// 다음 글자를 받아와서 아래 문자에 해당할 경우 pass
			if(str.equals("i")) continue;
			if(str.equals("pa")) continue;
			if(str.equals("te")) continue;
			if(str.equals("ni")) continue;
			if(str.equals("niti")) continue;
			if(str.equals("a")) continue;
			if(str.equals("ali")) continue;
			if(str.equals("nego")) continue;
			if(str.equals("no")) continue;
			if(str.equals("ili")) continue;
			sb.append(str.toUpperCase().charAt(0));									// 아래 문자에 해당하지 않을 경우 대문자로 바꿔서 붙임
		}
		
		System.out.println(sb);
		
	}

}
